package com.sparta.book.library.service;

import com.sparta.book.library.dto.LibraryRequestDto;
import com.sparta.book.library.dto.LibraryResponseDto;
import com.sparta.book.library.entity.Library;
import com.sparta.book.library.repository.LibraryRepository;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public LibraryResponseDto checkBook(LibraryRequestDto checkRequestDto) {

        // 1. checkRequestDto를 entity에 보내준다.
        Library library = new Library(checkRequestDto);

        // 2. entity를 DB에 보내준다.
        Library saveLibrary = libraryRepository.save(library);

        // 3. entity에서 checkResponseDto에 보내준다.
        LibraryResponseDto checkResponseDto = new LibraryResponseDto(saveLibrary);

        // 4. controller에게 보내준다.
        return checkResponseDto;
    }


    public LibraryResponseDto returnBook(LibraryRequestDto returnRequestDto) {

        Library library = new Library(returnRequestDto);

        Library savaLibrary = libraryRepository.save(library);

        LibraryResponseDto libraryResponseDto = new LibraryResponseDto(savaLibrary);

        return libraryResponseDto;
    }

}
