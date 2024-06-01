package com.hanbat.reserve.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hanbat.reserve.dto.reserveDto;

@Repository
public class reserveDao implements IreserveDao{
	
	//db
	@Autowired
	private SqlMapClientTemplate sm;
	
	@Override	
	public void insert(reserveDto dto)
	{
		
		try
		{
			sm.insert("reserve.insert", dto);
						//���ӽ����̽�.id 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	@Override
	public void cancel(reserveDto dto)
	{
		
		try
		{
			sm.update("reserve.cancel", dto);			//???????
						//���ӽ����̽�.id 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	@Override
	public List getList(HashMap map) {
		try
		{
			List list = (List)sm.queryForList("reserve.getList",map);
		                              //���ӽ����̽�.id 
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List reserveConfirm(HashMap map) 
	{
		try
		{
			List list = (List)sm.queryForList("reserve.reserveConfirm",map);
		                              //���ӽ����̽�.id 
			
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	
	}
}
