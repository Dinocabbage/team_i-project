package com.example.testproject.repository;

import com.example.testproject.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(String id);
    Optional<Member> findByNickName(String nickName);
    List<Member> findAll();
}