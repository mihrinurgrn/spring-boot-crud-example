package com.cashcard;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

interface CashCardRepository extends CrudRepository<CashCard,Long>, PagingAndSortingRepository<CashCard, Long> {
    CashCard findByIdAndOwner(Long requestedId,String name);
    Page<CashCard> findByOwner(String name, PageRequest pageRequest);
    boolean existsByIdAndOwner(Long id, String owner);
}
