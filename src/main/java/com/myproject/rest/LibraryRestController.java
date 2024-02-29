package com.myproject.java.rest;

import com.myproject.java.entity.Books;
import com.myproject.java.entity.Student;
import com.myproject.java.service.BooksServiceDAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library-management")
public class LibraryRestController
{
    private BooksServiceDAO booksServiceDAO;

    public LibraryRestController(BooksServiceDAO booksServiceDAO) {
        this.booksServiceDAO = booksServiceDAO;
    }

    @GetMapping("/books")
    public List<Books>findAllBooks()
    {
        return booksServiceDAO.findAllBooks();
    }
    @GetMapping("/books/{book_id}")
    public Books findbookId(@PathVariable int book_id)
    {
        return  booksServiceDAO.findById_Books(book_id);
    }
    @GetMapping("/students")
    public List<Student>findAllStudents()
    {
        return booksServiceDAO.findAllStudent();
    }
    @GetMapping("/students/{student_id}")
    public Student findStudentId(@PathVariable int student_id)
    {
        return  booksServiceDAO.findById_Student(student_id);
    }
    @PostMapping("/books")
    public Books addBooks(@RequestBody Books theBooks)
    {
        return booksServiceDAO.save_books(theBooks);
    }
    @PostMapping("/students")
    public Student addStudents(@RequestBody Student theStudent)
    {
        return booksServiceDAO.save_students(theStudent);
    }
    @PutMapping("/books")
    public void updateBook(@RequestBody Books theBook)
    {
        booksServiceDAO.update_Book(theBook);
    }
    @PutMapping("/students")
    public void updateStudent(@RequestBody Student theStudent)
    {
        booksServiceDAO.update_student(theStudent);
    }
    @DeleteMapping("/books/{book_id}")
    public String removeBook(@PathVariable int book_id)
    {
        booksServiceDAO.deleteById_Book(book_id);
        return "The deleted book id is: " + book_id;
    }
    @DeleteMapping("/students/{student_id}")
    public String removeStudent(@PathVariable int student_id)
    {
        booksServiceDAO.deleteById_Student(student_id);
        return "The deleted student is: " + student_id;
    }
}
