package com.example.rediscachespringjava.service;

import com.example.rediscachespringjava.domain.Member;

public interface RedisTestService {
    void joinMember(Member member);
    Member updateMember(Member member, Long memberId);
    Member getMemberInfo(Long memberId);
    void removeMember(Long memberId);
}