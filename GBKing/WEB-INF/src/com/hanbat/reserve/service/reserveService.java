package com.hanbat.reserve.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbat.reserve.dao.IreserveDao;
import com.hanbat.reserve.dto.reserveDto;



@Service
public class reserveService implements IreserveService{
	
	@Autowired
	private IreserveDao reserveDao;

	@Override
	public List getList(HashMap map) 
	{
		return reserveDao.getList(map);
	}
	
	@Override
	public List reserveConfirm(HashMap map) 
	{
		return reserveDao.reserveConfirm(map);
	}
	
	@Override	
	public void insert(reserveDto dto)
	{
		reserveDao.insert(dto);
	}
	
	@Override
	public void cancel(reserveDto dto)
	{
		reserveDao.cancel(dto);
	}


}
