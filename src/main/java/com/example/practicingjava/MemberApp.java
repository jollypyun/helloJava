package com.example.practicingjava;

import com.example.member.Grade;
import com.example.member.Member;
import com.example.member.MemberService;
import com.example.member.MemberServiceImpl;

// 순수 자바로만 코딩 (spring x)
public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
