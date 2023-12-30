package com.sparta.book.member.controller;

import com.sparta.book.member.dto.MemberRequestDto;
import com.sparta.book.member.dto.MemberResponseDto;
import com.sparta.book.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 회원 등록(POST)
    @PostMapping("/member")
    public MemberResponseDto createMember(@RequestBody MemberRequestDto memberRequestDto) {

        return memberService.createMember(memberRequestDto);
    }

    // 회원 대출 내역 조회(GET)
    @GetMapping("/members")
    public List<MemberResponseDto> listMember() {

        return memberService.listMember();
    }

}
