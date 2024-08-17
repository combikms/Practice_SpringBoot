package com.kangcombi.shop.Item;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ItemRepository extends JpaRepository<Item, Long> {
    Page<Item> findPageBy(Pageable page);
    List<Item> findAllByTitleContains(String title);

//    쌩으로 SQL 실행하는 법:
//    @Query(value = "select * from item where match(title) against(?1)", nativeQuery = true)
//    Item rawQuery1(String searchText);

}
