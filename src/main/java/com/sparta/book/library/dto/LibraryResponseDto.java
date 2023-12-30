package com.sparta.book.library.dto;

import com.sparta.book.library.entity.Library;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LibraryResponseDto {

    private Long id;
    private String title;
    private String socialNumber;
    private char book_state;
    private String check_date;
    private String return_date;

    public LibraryResponseDto(Library saveLibrary) {

        this.id = saveLibrary.getId();
        this.title = saveLibrary.getTitle();
        this.socialNumber = saveLibrary.getSocialNumber();
        this.book_state = saveLibrary.getBook_state();
        this.check_date = saveLibrary.getCheck_date();
        this.return_date = saveLibrary.getReturn_date();
    }
}
