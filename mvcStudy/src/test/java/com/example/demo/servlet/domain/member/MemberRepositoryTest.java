package com.example.demo.servlet.domain.member;

import com.example.demo.domain.member.Member;
import com.example.demo.domain.member.MemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach // 한줄한줄 테스트할때마다 해당 함수를 실행하는 어노테이션
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save() {
        //given
        Member member = new Member("hello", 20);
        //when
        Member savedMember = memberRepository.save(member);
        //then
        Member findMember = memberRepository.findById(savedMember.getId());

        assertThat(findMember).isEqualTo(savedMember);
    }

    @Test
    void findAll() {
        //given
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 30);
        memberRepository.save(member1);
        memberRepository.save(member2);
        //when
        List<Member> result = memberRepository.findAll();
        //then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(member1, member2);
    }

}
