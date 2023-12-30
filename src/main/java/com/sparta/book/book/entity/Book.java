package com.sparta.book.book.entity;

import com.sparta.book.book.dto.BookRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
// 데이터베이스에 저장한다는 어노테이션
@Getter
// 이 코드에 대한 정보를 읽을 수 있다.
@Setter
// 이 코드에 대한 정보를 변경할 수 있다.
@Table(name = "book")
// 데이터베이스 안에서 책의 정보를 저장할 장소의 이름을 "book"이라고 정한다.
@NoArgsConstructor
// 책에 대한 정보를 입력하지 않고도 'Book'이라는 객체를 만들 수 있게 해준다.
public class Book {

    @Id
    // 책마다 고유한 식별 번호가 있다는 것을 만들어준다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 어떤 방식으로 고유한 식별 번호를 지정할 것인가라는 어노테이션
    // IDENTITY : IDENTITY컬럼을 사용하여 기본 키를 생성
    // AUTO : JPA 구현체가 자동으로 가장 적절한 전략을 선택
    // SEQUENCE : 데이터베이스에 미리 정의된 숫자 범위를 가지고 순차적으로 증가
    // TABLE : 하나의 별도 테이블을 사용해 모든 엔티티의 ID를 관리
    private Long id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String language;

    @Column
    private String company;

    @Column
    private String book_date;

    // 이렇게 정의된 'Book'클래스를 사용하면, 책에 관한 모든 정보를 쉽게 저장하고,
    // 필요할 때 데이터베이스에서 다시 찾아볼 수 있다.

    public Book(BookRequestDto bookRequestDto) {

        this.title = bookRequestDto.getTitle();
        this.author = bookRequestDto.getAuthor();
        this.language = bookRequestDto.getLanguage();
        this.company = bookRequestDto.getCompany();
        this.book_date = bookRequestDto.getBook_date();
    }

}
