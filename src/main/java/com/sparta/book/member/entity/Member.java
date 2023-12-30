package com.sparta.book.member.entity;

import com.sparta.book.member.dto.MemberRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "member")
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private char gender;

    @Column
    private String socialNumber;

    @Column
    private String phoneNumber;

    @Column
    private String address;

    public Member(MemberRequestDto memberRequestDto) {

        this.name = memberRequestDto.getName();
        this.gender = memberRequestDto.getGender();
        this.socialNumber = memberRequestDto.getSocialNumber();
        this.phoneNumber = memberRequestDto.getPhoneNumber();
        this.address = memberRequestDto.getAddress();
    }

}
