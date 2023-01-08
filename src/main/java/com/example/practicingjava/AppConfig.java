package com.example.practicingjava;

import com.example.discount.DiscountPolicy;
import com.example.discount.FixDiscountPolicy;
import com.example.member.MemberService;
import com.example.member.MemberServiceImpl;
import com.example.member.MemoryMemberReopsitory;
import com.example.order.OrderService;
import com.example.order.OrderServiceImpl;

// 이제는 MemberServiceImpl은 AppConfig(외부)에서 결정된다.
// 의존 관계에 대한 것은 여기서 일어난다.
public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private static MemoryMemberReopsitory memberRepository() {
        return new MemoryMemberReopsitory();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(discountPolicy(), memberRepository());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
