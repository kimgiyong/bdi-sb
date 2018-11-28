package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.JapanDAO;
import com.example.demo.service.JapanService;
import com.example.demo.vo.JapanVO;

public class JapanServiceImpl implements JapanService {

	@Autowired
	private JapanDAO jd;
	
	@Override
	public List<JapanVO> japanSelectList(JapanVO japan) {
		return jd.japanSelectList(japan);
	}

	@Override
	public JapanVO japanSelect(int jpnum) {
		return jd.japanSelect(jpnum);
	}

	@Override
	public int japanInsert(JapanVO japan) {
		return jd.japanInsert(japan);
	}

	@Override
	public int japanUpdate(JapanVO japan) {
		return jd.japanUpdate(japan);
	}

	@Override
	public int japanDelete(int jpnum) {
		return jd.japanDelete(jpnum);
	}

}
