package com.example.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberReopsitory implements  MemberRepository{
    private static Map<Long, Member> store = new HashMap<>(); // 저장소가 변경될 경우 OCP를 위반한다. 원래 코드의 수정이 불가피하다.

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
