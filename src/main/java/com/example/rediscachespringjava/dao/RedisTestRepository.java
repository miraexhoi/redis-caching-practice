package com.example.rediscachespringjava.dao;

import com.example.rediscachespringjava.domain.Member;

public interface RedisTestRepository {
    Member save(Member member);
    Member findOne(Long memberId);
    void remove(Member member);
}