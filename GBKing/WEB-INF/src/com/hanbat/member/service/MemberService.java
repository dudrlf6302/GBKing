package com.hanbat.member.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbat.member.dao.IMemberDao;
import com.hanbat.member.dto.MemberDto;

@Service
public class MemberService implements IMemberService{

	@Autowired
	private IMemberDao memberDao;
	
	
	
	
	@Override
	public int Idcheck(HashMap map) {
		// TODO Auto-generated method stub
		return memberDao.Idcheck(map);
	}

	@Override
	public int insert(MemberDto dto) {
		memberDao.insert(dto);
		return 0;
	}

	@Override
	public int update(MemberDto dto) {
		memberDao.update(dto);
		return 0;
	}

	@Override
	public int delete(MemberDto dto) {
		memberDao.delete(dto);
		return 0;
	}

	@Override
	public List getList(HashMap map) {
		return memberDao.getList(map);
	}

	@Override
	public MemberDto getUserInfo(HashMap map) {
		return memberDao.getUserInfo(map);
	}

	@Override
	public List getZipcodeList(HashMap map) {
		// TODO Auto-generated method stub
		
		
		return memberDao.getZipcodeList(map);
	}

		

}
