package com.sparta.book.library.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LibraryRequestDto {

    private String title;
    private String socialNumber;
    private char book_state;
    private String check_date;
    private String return_date;


}
