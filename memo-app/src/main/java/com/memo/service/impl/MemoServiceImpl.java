package com.memo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.memo.repository.MemoRepository;
import com.memo.service.MemoService;
import com.memo.entity.Memo;

@Service
@Transactional
public class MemoServiceImpl implements MemoService {

	@Autowired
	private MemoRepository memoRepository;

	@Override
	public Memo save(Memo memo) {
		return memoRepository.save(memo);
	}

	@Override
	public List<Memo> findAll() {
		// TODO Auto-generated method stub
		return memoRepository.findAll();
	}

	@Override
	public void saveAndFlush(Memo memo) {
		memoRepository.saveAndFlush(memo);		
	}

}
