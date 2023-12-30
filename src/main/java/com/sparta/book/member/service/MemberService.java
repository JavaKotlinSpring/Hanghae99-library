package com.sparta.book.member.service;

import com.sparta.book.member.dto.MemberRequestDto;
import com.sparta.book.member.dto.MemberResponseDto;
import com.sparta.book.member.entity.Member;
import com.sparta.book.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public MemberResponseDto createMember(MemberRequestDto memberRequestDto) {

        // 1. memberRequestDto를 entity로 보내준다.
        Member member = new Member(memberRequestDto);

        // 2. member 객체를 DB에 저장한다.
        Member saveMember = memberRepository.save(member);

        // 3. DB에서 memberResponseDto에 보내준다.
        MemberResponseDto memberResponseDto = new MemberResponseDto(saveMember);

        // 4. memberResponseDto를 controller에 보내준다.
        return memberResponseDto;

    }

    public List<MemberResponseDto> listMember() {
        // 1. DB에서 MemberResponseDto에 담아 리스트로 만들어 보내준다.
        return memberRepository.findAll().stream().map(MemberResponseDto::new).toList();
    }

}