package com.myproject.java.dao;

import com.myproject.java.entity.Books;
import com.myproject.java.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class LibraryDAOImpl implements LibraryDAO
{
    private EntityManager entityManager;

    @Autowired
    public LibraryDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Books> findAllBooks()
    {
        TypedQuery<Books>theQuery= entityManager.createQuery("FROM Books",Books.class);
        return theQuery.getResultList();
    }

    @Transactional
    @Override
    public Books save(Books theBooks)
    {
       return entityManager.merge(theBooks);
    }

    @Override
    public Books findById_Books(int theId_books)
    {
        return entityManager.find(Books.class, theId_books);
    }

    @Transactional
    @Override
    public void deleteById_Book(int theBooks)
    {
        entityManager.remove(theBooks);
    }

    @Transactional
    @Override
    public void update(Books theBooks){
        entityManager.merge(theBooks);

    }

    @Override
    public List<Student> findAllStudent()
    {
        TypedQuery<Student>theQuery_1= entityManager.createQuery("FROM Student",Student.class);
        return theQuery_1.getResultList();
    }

    @Transactional
    @Override
    public Student save(Student theStudents)
    {
        return entityManager.merge(theStudents);
    }

    @Override
    public Student findById_Student(int theId_student)
    {
        return entityManager.find(Student.class, theId_student);
    }

    @Transactional
    @Override
    public void deleteById_Student(int theStudents)
    {
        entityManager.remove(theStudents);
    }

    @Transactional
    @Override
    public void update(Student theStudent){
        entityManager.merge(theStudent);
    }
}