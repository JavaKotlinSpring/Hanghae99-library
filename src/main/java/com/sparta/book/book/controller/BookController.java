package com.sparta.book.book.controller;

import com.sparta.book.book.dto.BookRequestDto;
import com.sparta.book.book.dto.BookResponseDto;
import com.sparta.book.book.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // 도서 등록(POST)
    @PostMapping("/book")
    public BookResponseDto createBook(@RequestBody BookRequestDto bookRequestDto) {

        return bookService.createBook(bookRequestDto);
    }

    // 선택 도서 조회(GET)
    @GetMapping("/book/{id}")
    public BookResponseDto getBook(@PathVariable Long id) {

        return bookService.getBook(id);
    }

    // 도서 목록 조회(GET)
    @GetMapping("/books")
    public List<BookResponseDto> listBook() {

        return bookService.listBook();
    }

}
