package com.hanbat.reserve.service;

import java.util.HashMap;
import java.util.List;

import com.hanbat.reserve.dto.reserveDto;


public interface IreserveService {

	List getList(HashMap map);

	List reserveConfirm(HashMap map);

	void insert(reserveDto dto);

	void cancel(reserveDto dto);

}
