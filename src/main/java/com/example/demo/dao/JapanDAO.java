package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.JapanVO;

public interface JapanDAO {
	
	public List<JapanVO> japanSelectList(JapanVO jList);
	public JapanVO japanSelect(int jpnum);
	public int japanInsert(JapanVO japan);
	public int japanUpdate(JapanVO japan);
	public int japanDelete(int jpnum);
}
