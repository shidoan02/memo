package com.memo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.memo.entity.Memo;
import com.memo.service.MemoService;

@Controller
public class MemoController {
	@Autowired
	MemoService memoService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) { // 型 変数
		model.addAttribute("memos", memoService.findAll());
		return "index";
	}

}