package com.hanbat.menu.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hanbat.menu.dto.BuyDto;
import com.hanbat.menu.dto.MenuDto;
import com.hanbat.reserve.dto.reserveDto;


@Repository
public class MenuDao implements IMenuDao{
	//db 
	@Autowired
	private SqlMapClientTemplate sm;
		
	@Override
	public List getList(HashMap map) {
		try
		{
			List<MenuDto> list = (List<MenuDto>)
					sm.queryForList("menu.getList", map);
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		} 
		return null;
	}
	
	@Override
	public List menuConfirm(HashMap map) 
	{
		try
		{
			List list = (List)sm.queryForList("menu.menuConfirm",map);
			
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List menuList(HashMap map) 
	{
		try
		{
			List list = (List)sm.queryForList("menu.menuList",map);
			
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void cancel(BuyDto dto)
	{
		try
		{
			sm.update("menu.cancel", dto);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	@Override
	public int getTotalCount(HashMap map)
	{
		try
		{									 //네임스페이스.id 
			String temp = (String)
					sm.queryForObject("menu.getTotalCount", map);
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
	public int getOrder_Num(HashMap map)
	{
		try
		{									 //네임스페이스.id 
			String temp = (String)sm.queryForObject("menu.getOrder_num", map);
			int order_num = Integer.parseInt(temp);
		                       
			return order_num;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	@Override
	public MenuDto getView(String seq) throws Exception
	{
		try
		{
			MenuDto dto = (MenuDto)sm.queryForObject("menu.getView",seq);
			return dto;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	@Override
	public void buy(BuyDto dto)
	{
		try
		{
			sm.insert("menu.buy", dto);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}
	
	@Override
	public void add(MenuDto dto)
	{
		try
		{
			sm.insert("menu.add", dto);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}
	
	@Override
	public void update(MenuDto dto)
	{
		try
		{
			sm.insert("menu.update", dto);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}
	
	@Override
	public void delete(MenuDto dto)
	{
		try
		{
			sm.insert("menu.delete", dto);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}
	
}
