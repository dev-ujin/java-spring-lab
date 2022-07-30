package com.devujin.springcorebasics.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
