package com.BookStore.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStore.BookStore.entity.MyBookList;
@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer>{

}
