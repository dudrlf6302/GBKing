package com.hanbat.menu.dao;

import java.util.HashMap;
import java.util.List;

import com.hanbat.menu.dto.BuyDto;
import com.hanbat.menu.dto.MenuDto;

public interface IMenuDao {

	int getTotalCount(HashMap map);
	int getOrder_Num(HashMap map);
	MenuDto getView(String seq) throws Exception;
	void buy(BuyDto dto);
	void update(MenuDto dto);
	void delete(MenuDto dto);
	void add(MenuDto dto);
	List getList(HashMap map);
	List menuConfirm(HashMap map);
	void cancel(BuyDto dto);
	List menuList(HashMap map);
	
}
