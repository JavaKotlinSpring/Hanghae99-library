package com.sparta.book.library.entity;

import com.sparta.book.library.dto.LibraryRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "library")
@NoArgsConstructor
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String socialNumber;

    @Column
    private char book_state;

    @Column
    private String check_date;

    @Column
    private String return_date;

    public Library(LibraryRequestDto checkRequestDto) {

        this.title = checkRequestDto.getTitle();
        this.socialNumber = checkRequestDto.getSocialNumber();
        this.book_state = checkRequestDto.getBook_state();
        this.check_date = checkRequestDto.getCheck_date();
        this.return_date = checkRequestDto.getReturn_date();
    }

}
