package com.myproject.java.service;

import com.myproject.java.dao.LibraryDAO;
import com.myproject.java.entity.Books;
import com.myproject.java.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceDAOImpl implements BooksServiceDAO
{
    private LibraryDAO libraryDAO;

    @Autowired
    public BooksServiceDAOImpl(LibraryDAO libraryDAO)
    {
        this.libraryDAO = libraryDAO;
    }

    @Override
    public List<Books> findAllBooks()
    {
        return libraryDAO.findAllBooks();
    }

    @Override
    public Books save_books(Books theBooks)
    {
        return libraryDAO.save(theBooks);
    }

    @Override
    public Books findById_Books(int theId_books)
    {
        return libraryDAO.findById_Books(theId_books);
    }


    @Override
    public void deleteById_Book(int theBooks)
    {
        libraryDAO.deleteById_Book(theBooks);
    }

    @Override
    public void update_Book(Books theBooks){
        libraryDAO.update(theBooks);
    }

    @Override
    public List<Student> findAllStudent()
    {
        return libraryDAO.findAllStudent();
    }

    @Override
    public Student save_students(Student theStudents) {
        return libraryDAO.save(theStudents);
    }

    @Override
    public Student findById_Student(int theId_student)
    {
        return libraryDAO.findById_Student(theId_student);
    }

    @Override
    public void deleteById_Student(int theStudent)
    {
        libraryDAO.deleteById_Student(theStudent);
    }

    @Override
    public void update_student(Student theStudent) {
        libraryDAO.update(theStudent);
    }
}