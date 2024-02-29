package com.myproject.java.service;

import com.myproject.java.entity.Books;
import com.myproject.java.entity.Student;

import java.util.List;

public interface BooksServiceDAO
{
    //FOR BOOKS
    List<Books> findAllBooks();
    Books save_books(Books theBooks);
    Books findById_Books(int theId_books);
    void deleteById_Book(int theBooks);
    void update_Book(Books theBooks);

    //FOR STUDENT
    List<Student> findAllStudent();
    Student save_students(Student theStudents);
    Student findById_Student(int theId_student);
    void deleteById_Student(int theStudent);
    void update_student(Student theStudent);

}
