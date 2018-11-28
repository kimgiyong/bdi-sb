package com.example.demo.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.BoardService;
import com.example.demo.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private SqlSession ss;
	
	@Override
	public int boardInsert(BoardVO board) {
		List<BoardVO> bo = ss.selectList("com.example.demo.BOARD.boardSelect");
		if(board.getBtitle()!=null) {
			if(board.getBcontent()!=null) {
				board.setBnum(bo.size()+1);
				String dat = board.getBcredat();
				String tim = board.getBcretim();
				dat = dat.replace("년", "");
				dat = dat.replace("월", "");
				dat = dat.replace("일", "");
				tim = tim.replace("시", "");
				tim = tim.replace("분", "");
				tim = tim.replace("초", "");
				board.setBcredat(dat);
				board.setBcretim(tim);
				return ss.insert("com.example.demo.BOARD.boardInsert",board);
			}
		}
		return 0;
	}

}
