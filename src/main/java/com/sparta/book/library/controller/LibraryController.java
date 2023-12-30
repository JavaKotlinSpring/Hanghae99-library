package com.sparta.book.library.controller;

import com.sparta.book.library.dto.LibraryRequestDto;
import com.sparta.book.library.dto.LibraryResponseDto;
import com.sparta.book.library.service.LibraryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    // 도서 대출
    @PostMapping("/check/book")
    public LibraryResponseDto checkBook(@RequestBody LibraryRequestDto checkRequestDto) {

        return libraryService.checkBook(checkRequestDto);
    }

    // 도서 반납
    @PostMapping("/return/book")
    public LibraryResponseDto returnBook(@RequestBody LibraryRequestDto returnRequestDto) {

        return libraryService.returnBook(returnRequestDto);
    }

}
