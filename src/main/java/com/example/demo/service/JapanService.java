package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.vo.JapanVO;

public interface JapanService {

	public List<JapanVO> japanSelectList(JapanVO japan);
	public JapanVO japanSelect(int jpnum);
	public int japanInsert(JapanVO japan);
	public int japanUpdate(JapanVO japan);
	public int japanDelete(int jpnum);
}
