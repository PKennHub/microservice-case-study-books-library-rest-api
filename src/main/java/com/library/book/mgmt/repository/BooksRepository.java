package com.library.book.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.book.mgmt.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, String>{

}
