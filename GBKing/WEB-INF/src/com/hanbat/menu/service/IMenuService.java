package com.hanbat.menu.service;

import java.util.HashMap;
import java.util.List;

import com.hanbat.menu.dto.BuyDto;
import com.hanbat.menu.dto.MenuDto;


public interface IMenuService {

	void buy(BuyDto dto);
	int getTotalCount(HashMap map);
	int getOrder_Num(HashMap map);
	MenuDto getView(String seq);
	void save(MenuDto dto);
	void update(MenuDto dto);
	void delete(MenuDto dto);
	List getList(HashMap map);
	List menuConfirm(HashMap map);
	void cancel(BuyDto dto);
	List menuList(HashMap map);
}
