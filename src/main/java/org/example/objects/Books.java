package org.example.objects;

import lombok.Getter;

@Getter
public enum Books {

    BOOK_01(
            "name01",
            "author01",
            2000
    ),
    BOOK_02(
            "name02",
            "author02",
            2010
    );

    public final String bookName;
    public final String bookAuthor;
    public final Integer bookYear;

    // Constructor for enum constants
    Books(String bookName, String bookAuthor, int bookYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }
}
