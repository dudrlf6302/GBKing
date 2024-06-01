package com.hanbat.board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbat.board.dto.BoardDto;
import com.hanbat.board.dao.IBoardDao;

@Service
public class BoardService implements IBoardService {
	
	@Autowired
	private IBoardDao boardDao;
	
	@Override
	public int insert(BoardDto dto) {
		boardDao.insert(dto);
		return 0;
	}

	@Override
	public int update(BoardDto dto) {
		boardDao.update(dto);
		return 0;
	}

	@Override
	public int delete(BoardDto dto) {
		boardDao.delete(dto);
		return 0;
	}

	@Override
	public List getList(HashMap map) {
		return boardDao.getList(map);
	}

	@Override
	public BoardDto getUserInfo(HashMap map) {
		return boardDao.getUserInfo(map);
	}

	@Override
	public List getZipcodeList(HashMap map) {
		return boardDao.getZipcodeList(map);
	}

	@Override
	public BoardDto getView(String seq) {
		return boardDao.getView(seq);
	}
	
	@Override
	public int getTotalCount(HashMap map) {
		
		return boardDao.getTotalCount(map);
	}

	@Override
	public int reply(BoardDto dto) {
		
		return boardDao.reply(dto);
	}
	
	@Override
	public int getLogin(HashMap map) {
		// TODO Auto-generated method stub	
		return boardDao.Login(map);
	}
}
