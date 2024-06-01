package com.hanbat.board.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hanbat.board.dto.BoardDto;

@Repository
public class BoardDao implements IBoardDao {

	//db 
	@Autowired
	private SqlMapClientTemplate sm;
	@Override
	public int insert(BoardDto dto) {
		try
		{
			sm.insert("board.insert", dto);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

	@Override
	public int update(BoardDto dto) {
		try
		{
			sm.update("board.update", dto);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

	@Override
	public int delete(BoardDto dto) {
		try
		{
			sm.delete("board.delete", dto);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

	@Override
	public List getList(HashMap map) {
		try
		{
			List<BoardDto> list = (List<BoardDto>)
					sm.queryForList("board.list", map);
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BoardDto getUserInfo(HashMap map) {
		try
		{
			BoardDto dto = (BoardDto)
					sm.queryForObject("board.getUserInfo", map);
			return dto;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List getZipcodeList(HashMap map) {
		HashMap resultMap= new HashMap();
		try
		{
			System.out.println("####");
			List list = (List)
					 sm.queryForList("board.getZipcodeList",
							 map);
			for(int i=0; i<list.size(); i++)
			{
				HashMap temp=(HashMap)list.get(i);
				System.out.println(temp.get("ADDRESS"));
			}
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BoardDto getView(String seq) {
		try
		{			
			sm.update("board.hitUpdate", seq);
			BoardDto dto = (BoardDto)sm.queryForObject("board.getView",seq);			
			return dto;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return null;
	}

	@Override
	public int getTotalCount(HashMap map) {
		try
		{
			String temp =(String)sm.queryForObject("board.getTotalCount", map);
			int count = Integer.parseInt(temp);
		                              //네임스페이스.id 
			return count;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return 0;
	}

	@Override
	public int reply(BoardDto dto) {
		try
		{
			System.out.println(dto.getGroup_depth()+"daodepth");
			System.out.println(dto.getGroup_id()+"daoid");
			System.out.println(dto.getGroup_seq()+"daoseq");
			sm.update("board.updateGroupSeq", dto);
			sm.insert("board.reply", dto);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
		return 0;
	}
	@Override
	public int Login(HashMap map) {
		try
		{ 
			System.out.println(map.toString());
			String temp = (String)sm.queryForObject("board.find",  map);
				System.out.println("i??i?? : "+ temp);
				int count = Integer.parseInt(temp);
				return count;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return 0;
	}

}
