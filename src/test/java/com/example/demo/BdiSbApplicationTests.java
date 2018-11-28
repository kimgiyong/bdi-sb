package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controller.JapanController;
import com.example.demo.service.BoardService;
import com.example.demo.service.JapanService;
import com.example.demo.util.Calc;
import com.example.demo.vo.BoardVO;
import com.example.demo.vo.JapanVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BdiSbApplicationTests {
	
	@Autowired
	private Calc calc;
	
	@Autowired
	private BoardService bs;
	
/*	@Test
	public void contextLoads() {
		assertNotNull(calc);
	}

	@Test
	public void boardTest() {
		BoardVO bv = new BoardVO();
		bv.setBtitle("야근이다");
		bv.setBcontent("집가고싶다..");
		bv.setBcredat("2018년11월28일");
		bv.setBcretim("8시46분18초");
		assertEquals(1, bs.boardInsert(bv));
	}*/
	@Test
	public void CalcTest() {
		int result = calc.plus(4, 4);
		assertEquals(8, result);
	}
}
