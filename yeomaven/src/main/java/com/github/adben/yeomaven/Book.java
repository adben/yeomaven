package com.github.adben.yeomaven;

public class Book {
    private final double isbn;
    private final long price;
    private final String author;
    private final String title;
    private final String engTitle;
    private final String imagePath;

    public Book(BookBuilder builder) {
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.engTitle = builder.engTitle;
        this.author = builder.author;
        this.price = builder.price;
        this.imagePath = builder.imagePath;
    }

    public String getEngTitle() {
        return engTitle;
    }

    public double getIsbn() {
        return isbn;
    }

    public long getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public static class BookBuilder {
        private double isbn;
        private long price;
        private String author;
        private String title;
        private String engTitle;
        private String imagePath;

        public BookBuilder withIsbn(double i) {
            this.isbn = i;
            return this;
        }

        public BookBuilder withPrice(long p) {
            this.price = p;
            return this;
        }

        public BookBuilder withAuthor(String a) {
            this.author = a;
            return this;
        }

        public BookBuilder withTitle(String t) {
            this.title = t;
            return this;
        }

        public BookBuilder withEnglishTitle(String e) {
            this.engTitle = e;
            return this;
        }

        public BookBuilder withImagePath(String img) {
            this.imagePath = img;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
