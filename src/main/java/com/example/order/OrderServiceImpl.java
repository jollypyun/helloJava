package com.example.order;

import com.example.discount.DiscountPolicy;
import com.example.member.Member;
import com.example.member.MemberRepository;

public class OrderServiceImpl implements OrderService{
    // DIP 지키기
    private final DiscountPolicy discountPolicy;
    private final MemberRepository memberRepository;
    // private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); // 정률로 변경 시 OrderServiceImpl의 코드를 변경해야 한다. OCP 위반
    // private final DiscountPolicy discountPolicy = new RateDiscountPolicy(); // 구체클래스에 의존 DIP 위반

    public OrderServiceImpl(DiscountPolicy discountPolicy, MemberRepository memberRepository) {
        this.discountPolicy = discountPolicy;
        this.memberRepository = memberRepository;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
