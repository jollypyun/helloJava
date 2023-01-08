package com.example.member;

public class MemberServiceImpl implements MemberService {
    //private final MemberRepository memberRepository = new MemoryMemberReopsitory(); // 결국 이 코드는 추상화에도 의존, 구체화에도 의존하여 DIP를 위반함.

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
