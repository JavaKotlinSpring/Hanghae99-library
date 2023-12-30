package com.sparta.book.book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookRequestDto {

    private String title;
    private String author;
    private String language;
    private String company;
    private String book_date;
}
