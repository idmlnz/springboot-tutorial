package com.manning.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Created by imalonzo on 10/15/17.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
  List<Book> findByReader(String reader);
}
