package com.hanbat.member.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hanbat.member.dto.MemberDto;

@Repository
public class MemberDao implements IMemberDao{

	//db 
	@Autowired
	private SqlMapClientTemplate sm;
	
	
	
	
	
	@Override
	public int Idcheck(HashMap map) {
		try
		{ 
			System.out.println(map.toString());
			String temp = (String)sm.queryForObject("member.find",  map);
				System.out.println("íí : "+ temp);
				int count = Integer.parseInt(temp);
				return count;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return 0;
	}

	@Override
	public int insert(MemberDto dto) {

		try
		{
			sm.insert("member.insert", dto);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

	@Override
	public int update(MemberDto dto) {

		try
		{
			sm.update("member.update", dto);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

	@Override
	public int delete(MemberDto dto) {
		try
		{
			sm.update("member.delete", dto);
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
			List<MemberDto> list = (List<MemberDto>)
					sm.queryForList("member.list", map);
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MemberDto getUserInfo(HashMap map) {
		
		try
		{
			MemberDto dto = (MemberDto)
					sm.queryForObject("member.getUserInfo", map);
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
		// TODO Auto-generated method stub
		
		HashMap resultMap = new HashMap();
		try
		{
			List list = (List)
					sm.queryForList("member.getZipcodeList", map);
			resultMap.put("list",list);
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	

}
