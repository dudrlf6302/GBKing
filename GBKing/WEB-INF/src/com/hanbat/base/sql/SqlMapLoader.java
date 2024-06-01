package com.hanbat.base.sql;
/*IBatis 은 db connetion pool 을 제공 , 객체가 하나만 만들어져야 한다. 
 *싱클톤 패턴으로 구축
 *하나만 만들어져야 해서 static으로 SqlMapClient  변수선언
 */
import java.io.IOException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapLoader 
{
	private static SqlMapClient sqlMapper=null;

	public SqlMapLoader() 
	{
		
	}

	public static SqlMapClient getSqlMap(String s) throws IOException 
	{
		if(sqlMapper==null)
		{
			java.io.Reader reader = Resources.getResourceAsReader(s);
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();		
		}
		return  sqlMapper;
	}	
}
