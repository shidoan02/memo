package com.memo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memo.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
	List<Memo> findAll();

}
