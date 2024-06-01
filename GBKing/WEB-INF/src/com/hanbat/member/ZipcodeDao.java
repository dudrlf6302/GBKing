package com.hanbat.member;

import java.util.HashMap;
import java.util.List;

import com.hanbat.base.sql.SqlManager;
import com.hanbat.base.sql.SqlMapLoader;
import com.ibatis.sqlmap.client.SqlMapClient;

public class ZipcodeDao {
	SqlManager sm = new SqlManager();
	
	public List getList(HashMap map) 
	{
		try
		{
			List list = (List)sm.getList("zipcode.getList", map);
		                              //네임스페이스.id 
			return list;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return null;
	}
}
