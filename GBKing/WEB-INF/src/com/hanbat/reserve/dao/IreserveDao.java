package com.hanbat.reserve.dao;

import java.util.HashMap;
import java.util.List;

import com.hanbat.reserve.dto.reserveDto;

public interface IreserveDao {

	void insert(reserveDto dto);

	void cancel(reserveDto dto);

	List getList(HashMap map);
	
	List reserveConfirm(HashMap map);

}
