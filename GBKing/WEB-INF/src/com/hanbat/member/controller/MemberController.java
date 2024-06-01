package com.hanbat.member.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hanbat.member.dto.MemberDto;
import com.hanbat.member.service.IMemberService;

//������̼��� ���� �� Ŭ������ ��Ʈ�ѷ����� �˸���. 
@Controller
public class MemberController {

	@Autowired //�̸����� ã�Ƽ� �����϶� 
	private IMemberService memberService;
	
	@RequestMapping(value="/member/idcheck")
	public ModelAndView getIdchec(String user_id)
	{
		ModelAndView mv = new ModelAndView();		
		System.out.println("idcheck result : " + user_id );
		HashMap<String, String> map2 = new HashMap();
		int result =0;
		map2.put("user_id", user_id);
		
		result = memberService.Idcheck(map2);		
		
		if (result == 1) {
			System.out.println("idcheck success");
//			req.setAttribute("userid", userid);
//			req.setAttribute("check", 1);			
		//	session.setAttribute("userid", userid);
			mv.addObject("user_id",user_id);
			mv.addObject("idcheck",1);
		} else {
			System.out.println("idcheck fail");
			mv.addObject("user_id",user_id);
			mv.addObject("idcheck",0);
		}
		mv.setViewName("member/idcheck");
		
		return mv;
	}	
	
	
	//url ~  ~~/member/list.do 호출하면 /member/member_list.jsp 호출 된다.
	@RequestMapping(value="/member/list")
	public ModelAndView getList()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/member_list");
		
		
		
		HashMap map = new HashMap();
		List<MemberDto> list = memberService.getList(map);
		
		
		//db 불러오기
		mv.addObject("list", list);
		return mv;
	}
	
	
	//url ~  ~~/member/list.do 호출하면 /member/member_list.jsp 호출 된다.
	@RequestMapping(value="/member/write")
	public ModelAndView memberWrite()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/member_writeForm");
		
		return mv;
	}

	@RequestMapping(value="/member/save")
	public ModelAndView memberSave(MemberDto dto)
	{
		System.out.println("////////////////////////");
		
		ModelAndView mv = new ModelAndView();
	//	mv.setViewName("member/member_list");
	
		
		memberService.insert(dto);
		System.out.println(dto.toString());
		
		
		//HashMap map = new HashMap();
		//List<MemberDto> list = memberService.getList(map);

		//db 불러오기
		//mv.addObject("list", list);
		System.out.println(dto.getUser_id());
		mv.addObject("userid" ,dto.getUser_id());
		mv.addObject("password" ,dto.getPassword());
		mv.setViewName("board/board_main");
		return mv;
	}
	
	
	@RequestMapping(value="/member/zipcode")
	public ModelAndView getZipcodeList(String dong)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/zipcode");
		
		HashMap map = new HashMap();
		map.put("dong" , dong);
		List list = memberService.getZipcodeList(map);
		//db 불러오기
		mv.addObject("dong",dong);
		mv.addObject("list", list);
		return mv;
	}
	
}
