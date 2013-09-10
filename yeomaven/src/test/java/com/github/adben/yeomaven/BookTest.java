package com.github.adben.yeomaven;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Test voor {@link com.github.adben.yeomaven.Book}
 */
public class BookTest {
    private static final String AUTHOR = "Adolfo Benedetti";
    private static final String TITLE = "Un Titulo";
    private static final  String ENG_TITLE = "A Title";
    private static final String IMG_URL = "http://example.com/book.gif";
    private static final double ISBN = 307474728.000;
    private static final long PRICE = 30;

    @Test
    public void it_should_build_a_book_object() throws Exception {
        Book testBook = new Book.BookBuilder()
                .withAuthor(AUTHOR)
                .withEnglishTitle(ENG_TITLE)
                .withTitle(TITLE)
                .withImagePath(IMG_URL)
                .withIsbn(ISBN)
                .withPrice(PRICE)
                .build();

        assertThat(testBook, notNullValue());
        assertThat(testBook.getAuthor(), is(AUTHOR));
        assertThat(testBook.getTitle(), is(TITLE));
        assertThat(testBook.getEngTitle(), is(ENG_TITLE));
        assertThat(testBook.getImagePath(), is(IMG_URL));
        assertThat(testBook.getPrice(), is(PRICE));

    }
}
