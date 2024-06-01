package com.hanbat.member.dao;

import java.util.HashMap;
import java.util.List;

import com.hanbat.member.dto.MemberDto;

public interface IMemberDao {
	public int insert(MemberDto dto);
	public int update(MemberDto dto);
	public int delete(MemberDto dto);
	public List getList(HashMap map);
	public MemberDto getUserInfo(HashMap map);
	public List getZipcodeList(HashMap map);
	public int Idcheck(HashMap map);
}
