package com.sparta.book.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequestDto {

    private String name;
    private char gender;
    private String socialNumber;
    private String phoneNumber;
    private String address;

}
