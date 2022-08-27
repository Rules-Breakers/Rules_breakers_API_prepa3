package com.hackathon3.repository;

import com.hackathon3.model.Book;
import com.hackathon3.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {
  @Query("select count(b.borrowing_date) from Borrow b where b.book = :book ")
  int countBorrowingDate(
          @Param("book") Book book
  );
  @Query("select b.borrowing_date as borrowing_date, b.giving_back_date as giving_back_date from Borrow b where b.book.id = :id ")
  Object[] history(
          @Param("id") Long id
  );
}
