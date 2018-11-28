package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.JapanService;
import com.example.demo.vo.JapanVO;

@RestController
public class JapanController {

/*	@Autowired
	private JapanService js;
	
	@GetMapping("/japanList")
	public @ResponseBody List<JapanVO> japanSelectList(@ModelAttribute JapanVO japan) {
		return js.japanSelectList(japan);
	}
	@GetMapping("/japan/{jpnum}")
	public @ResponseBody JapanVO japanSelect(@PathVariable int jpnum) {
		return js.japanSelect(jpnum);
	}
	@PostMapping("/japan")
	public @ResponseBody int japanInsert(@RequestBody JapanVO japan) {
		return js.japanInsert(japan);
	}
	@PutMapping("/japan")
	public @ResponseBody int japanUpdate(@RequestBody JapanVO japan) {
		return js.japanUpdate(japan);
	}
	@DeleteMapping("/japan/{jpnum}")
	public @ResponseBody int japanDelete(@PathVariable int jpnum) {
		return js.japanDelete(jpnum);
	}
	*/
	
}
