package com.example.demo.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.JapanDAO;
import com.example.demo.vo.JapanVO;

public class JapanDAOImpl implements JapanDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<JapanVO> japanSelectList(JapanVO japan) {
		return ss.selectList("com.example.demo.JAPAN.selectListJapan",japan);
	}

	@Override
	public JapanVO japanSelect(int jpnum) {
		return ss.selectOne("com.example.demo.JAPAN.selectJapan",jpnum);
	}

	@Override
	public int japanInsert(JapanVO japan) {
		return ss.insert("com.example.demo.JAPAN.insertJapan",japan);
	}

	@Override
	public int japanUpdate(JapanVO japan) {
		return ss.update("com.example.demo.JAPAN.updateJapan",japan);
	}

	@Override
	public int japanDelete(int jpnum) {
		return ss.delete("com.examlpl.demo.JAPAN.deleteJapan",jpnum);
	}

}
