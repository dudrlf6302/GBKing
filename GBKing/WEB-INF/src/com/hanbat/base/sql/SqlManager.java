package com.hanbat.base.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

//import org.apache.log4j.Logger;

import com.ibatis.sqlmap.client.SqlMapClient;

public class SqlManager 
{
	//private static Logger log = Logger.getLogger("WEB");
	
	protected static SqlMapClient sqlMap;
	protected static String configFile = "/com/hanbat/config/SqlMapConfig.xml";

	public SqlManager() {
		init();
	}
	
	public void setConfigFile(String s) {
		configFile = s;
	}

	protected SqlMapClient getSqlMap() {
		return sqlMap;
	}

	public void init() 
	{		
		
		try 
		{	
			if(sqlMap == null)
			{
				sqlMap = SqlMapLoader.getSqlMap(configFile);
				if(sqlMap==null) System.out.println("********************************");
			}
		} 
		catch(Exception e)
		{
				e.printStackTrace();
		}
		
	}

	public Object insert(String s, Object obj) throws Exception {
		Object o;
		
		o= getSqlMap().insert(s, obj);
		
		return o;
	}
	
		
	public int update(String s, Object obj) throws Exception {
		return getSqlMap().update(s, obj);
	}

	
	public int delete(String s, Object obj) throws Exception {
		return getSqlMap().delete(s, obj);
	}

	public Object getObject(String s) throws Exception {
		return getSqlMap().queryForObject(s);
	}


	public Object getObject(String s, Object obj) throws Exception {
		return getSqlMap().queryForObject(s, obj);
	}	

	public Object getMap(String s, Map obj) throws Exception {
		return getSqlMap().queryForObject(s, obj);
	}	

	public List getList(String s) throws Exception {
		return getList(s, null);
	}

	public List getList(String s, Object obj) throws Exception {
		return getSqlMap().queryForList(s, obj);
	}

	public Object getMap(String s, Object obj, String s1) throws Exception {
		return getSqlMap().queryForObject(s, obj, s1);
	}

	public Object executeProcedure(String s, Map map) throws Exception 
	{
		Object result = null;
		try 
		{
			result = getSqlMap().queryForObject(s, map);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	public DataSource getDataSource() 
	{
		return getSqlMap().getDataSource();
	}

	public Connection getCurrentLocalConnection() throws SQLException 
	{
		return getSqlMap().getCurrentConnection();
	}

	public void begin() 
	{
		try 
		{
			getSqlMap().startTransaction();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		
		}
	}

	public void beginBatch() 
	{
		try 
		{
			getSqlMap().startBatch();
		} 
		catch (SQLException sqlexception) 
		{
			sqlexception.printStackTrace();
		}
		catch(Exception e)
		{
				e.printStackTrace();
		}
	}

	public void endBatch() 
	{
		try 
		{
			getSqlMap().executeBatch();
		}
		catch (SQLException sqlexception) 
		{
			sqlexception.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void commit() 
	{
		try 
		{
			getSqlMap().commitTransaction();
			getSqlMap().endTransaction();
		}
		catch (SQLException sqlexception) 
		{
			sqlexception.printStackTrace();
		}
		catch(Exception e)
		{
				e.printStackTrace();
		}
	}

	public void rollback() 
	{
		try 
		{
			getSqlMap().endTransaction();
		}
		catch (SQLException sqlexception) 
		{
			sqlexception.printStackTrace();
		}
		catch(Exception e)
		{
				e.printStackTrace();
		}
	}

	public void refresh() 
	{
		init();
	}

}
