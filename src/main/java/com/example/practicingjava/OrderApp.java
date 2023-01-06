package com.example.practicingjava;

import com.example.member.Grade;
import com.example.member.Member;
import com.example.member.MemberService;
import com.example.member.MemberServiceImpl;
import com.example.order.Order;
import com.example.order.OrderService;
import com.example.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberservice = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberservice.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
