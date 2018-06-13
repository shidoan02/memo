package com.memo.service;

import java.util.List;

import com.memo.entity.Memo;

public interface MemoService {

	Memo save(Memo memo);

	List<Memo> findAll();

	void saveAndFlush(Memo memo);


}
