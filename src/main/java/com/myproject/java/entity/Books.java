package com.myproject.java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Books
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "book_name")
    private String book_name;

    @Column(name = "author_name")
    private String author_name;

    @Column(name = "book_qty")
    private int book_qty;

    public Books() {
    }

    public Books(String book_name, String author_name, int book_qty) {
        this.book_name = book_name;
        this.author_name = author_name;
        this.book_qty = book_qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getBook_qty() {
        return book_qty;
    }

    public void setBook_qty(int book_qty) {
        this.book_qty = book_qty;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", book_name='" + book_name + '\'' +
                ", author_name='" + author_name + '\'' +
                ", book_qty=" + book_qty +
                '}';
    }
}
