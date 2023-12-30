package com.sparta.book.book.service;

import com.sparta.book.book.dto.BookRequestDto;
import com.sparta.book.book.dto.BookResponseDto;
import com.sparta.book.book.entity.Book;
import com.sparta.book.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookResponseDto createBook(BookRequestDto bookRequestDto) {
        // 1. requestDto를 entity로 보내준다.
        Book book = new Book(bookRequestDto);

        // 2. book 객체를 DB로 보내준다.
        Book saveBook = bookRepository.save(book);

        // 3. DB에서 bookResponseDto객체로 보내준다.
        BookResponseDto bookResponseDto = new BookResponseDto(saveBook);

        // 4. bookResponseDto객체를 controller로 보내준다.
        return bookResponseDto;
    }

    public BookResponseDto getBook(Long id) {

        return bookRepository.findById(id).map(BookResponseDto::new).orElseThrow(
                () -> new IllegalArgumentException("책이 존재하지 않습니다.")
        );
    }

    public List<BookResponseDto> listBook() {

        // DB에서 BookResponseDto에 리스트로 보내준다.
        return bookRepository.findAll().stream().map(BookResponseDto::new).toList();
    }
}
