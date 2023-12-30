package com.sparta.book.member.dto;

import com.sparta.book.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponseDto {

    private Long id;
    private String name;
    private char gender;
    private String socialNumber;
    private String phoneNumber;
    private String address;

    public MemberResponseDto(Member saveMember) {

        this.id = saveMember.getId();
        this.name = saveMember.getName();
        this.gender = saveMember.getGender();
        this.socialNumber = saveMember.getSocialNumber();
        this.phoneNumber = saveMember.getPhoneNumber();
        this.address = saveMember.getAddress();
    }

}
