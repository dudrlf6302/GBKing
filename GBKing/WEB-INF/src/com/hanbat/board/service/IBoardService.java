package com.hanbat.board.service;

import java.util.HashMap;
import java.util.List;

import com.hanbat.board.dto.BoardDto;

public interface IBoardService {
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(BoardDto dto);
	public int reply(BoardDto dto);
	public List getList(HashMap map);
	public BoardDto getUserInfo(HashMap map);
	public List getZipcodeList(HashMap map);
	public BoardDto getView(String seq);
	public int getTotalCount(HashMap map);
	int getLogin(HashMap map);
}
