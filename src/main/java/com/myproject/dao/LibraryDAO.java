package com.myproject.java.dao;

import com.myproject.java.entity.Books;
import com.myproject.java.entity.Student;

import java.util.List;

public interface LibraryDAO
{
    //FOR BOOKS
    List<Books> findAllBooks();
    Books save(Books theBooks);
    Books findById_Books(int theId_books);
    void deleteById_Book(int theBooks);
    void update(Books theBooks);

    //FOR STUDENT
    List<Student> findAllStudent();
    Student save(Student theStudents);
    Student findById_Student(int theId_student);
    void deleteById_Student(int theStudent);
    void update(Student theStudent);
}
