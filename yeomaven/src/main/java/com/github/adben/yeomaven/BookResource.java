package com.github.adben.yeomaven;

import com.google.common.collect.ImmutableSet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Collection;

@Path("/books")
public class BookResource {

    public static final ImmutableSet<Book> COLOMBIAN_BOOKS = ImmutableSet.of(
            new Book.BookBuilder().withIsbn(307474728)
                    .withAuthor("Gabriel Garcia Marquez")
                    .withImagePath("http://ecx.images-amazon.com/images/I/51fGhfrrU0L._SY346_PJlook-inside-v2,TopRight,1,0_SH20_.jpg")
                    .withTitle("Cien anos de soledad")
                    .withEnglishTitle("One Hundred Years of Solitude")
                    .withPrice(35).build(),

            new Book.BookBuilder().withIsbn(307474780)
                    .withAuthor("Gabriel Garcia Marquez")
                    .withImagePath("http://ecx.images-amazon.com/images/I/51MVQeBxA8L._SY346_PJlook-inside-v2,TopRight,1,0_SH20_.jpg")
                    .withTitle("El amor en los tiempos del cólera")
                    .withEnglishTitle("Love in the Time of Cholera")
                    .withPrice(25).build(),

            new Book.BookBuilder().withIsbn(307474728)
                    .withAuthor("Héctor Abad Faciolince")
                    .withImagePath("http://ecx.images-amazon.com/images/I/51EzVv%2BD%2BpL._SY346_PJlook-inside-v2,TopRight,1,0_SH20_.jpg")
                    .withTitle("El olvido que seremos")
                    .withEnglishTitle("We wil be…forgotten")
                    .withPrice(45).build(),

            new Book.BookBuilder().withIsbn(307474728)
                    .withAuthor("Laura Restrepo")
                    .withImagePath("http://ecx.images-amazon.com/images/I/41y9ri-4GCL._PJlook-inside-v2,TopRight,1,0_SH20_.jpg")
                    .withTitle("Delirio")
                    .withEnglishTitle("Delirium")
                    .withPrice(30).build()
    );

    @GET
    public Collection<Book> list() {
        return COLOMBIAN_BOOKS;
    }
}
