package com.memo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.memo.entity.Memo;
import com.memo.service.MemoService;

@RestController // HTMLではなくJSONを返す
public class MemoRestController {
	
  @Autowired
  private MemoService memoService;

  @RequestMapping(value = "/memos", method = RequestMethod.POST)
  @ResponseBody
  public Memo create(@RequestBody Memo memo) {
    memoService.saveAndFlush(memo);
    return memo;
  }

}
