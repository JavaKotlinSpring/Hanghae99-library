package com.sparta.book.book.dto;

import com.sparta.book.book.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookResponseDto {

    private Long id;
    private String title;
    private String author;
    private String language;
    private String company;
    private String book_date;

    public BookResponseDto(Book saveBook) {

        this.id = saveBook.getId();
        this.title = saveBook.getTitle();
        this.author = saveBook.getAuthor();
        this.language = saveBook.getLanguage();
        this.company = saveBook.getCompany();
        this.book_date = saveBook.getBook_date();
    }

}
