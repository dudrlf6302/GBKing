package com.hanbat.board.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hanbat.board.dto.BoardDto;
import com.hanbat.board.service.IBoardService;

@Controller
public class BoardController {
	@Autowired //占싱몌옙占쏙옙占쏙옙 찾占싣쇽옙 占쏙옙占쏙옙占싹띰옙 
	private IBoardService boardService;
	
	String session_id="";
	int session_check=0;
	
	@RequestMapping(value="/board/main")
	public ModelAndView getMain()
	{
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("board/board_main");
		
		return mv;
	}
	
	@RequestMapping(value="/board/logout")
	public ModelAndView getLogout()
	{	
		String logout = "out";
		
		ModelAndView mv = new ModelAndView();		
		mv.addObject("logout",logout);
		mv.setViewName("board/board_main");
		
		return mv;
	}
	
	
	@RequestMapping(value="/board/login")
	public ModelAndView getLogin( String userid,String pw)
	{
		ModelAndView mv = new ModelAndView();		
		//userid = "TEST";
		//pw = "1234";
		
		HashMap<String, String> map2 = new HashMap();
		int result =0;
		map2.put("user_id", userid);
		map2.put("password", pw);
		
		result = boardService.getLogin(map2);		
		
		if (result == 1) {
			System.out.println("longin");
//			req.setAttribute("userid", userid);
//			req.setAttribute("check", 1);			
		//	session.setAttribute("userid", userid);
			session_id = userid;
			session_check= result;
			mv.addObject("session_id",userid);
			mv.addObject("session_check",1);
		} else {
			System.out.println("longin fail");
			mv.addObject("check",0);
			mv.addObject("loginConfirm","fail");
		}
		mv.setViewName("board/board_main");
		
		return mv;
	}
	
	@RequestMapping(value="/board/list")
	public ModelAndView getList(String type,String searchKey, String searchWord,String pg)
	{

		if(type==null || type.equals(""))
			type="0";		
		if(pg==null || pg.equals(""))
			pg="0";
		if(searchKey==null || searchKey.equals(""))
			searchWord="";
		
//		System.out.println(board_list);
//		System.out.println(type);		
		ModelAndView mv = new ModelAndView();
		HashMap map = new HashMap();		
	
		mv.setViewName("board/board_list");			
		map.put("type", type);
		map.put("pg", pg);
		map.put("searchKey", searchKey);
		map.put("searchWord", searchWord);
		
	//	System.out.println(searchKey +""+ searchWord);
	//	System.out.println("123254325345"+pg);
	//호占쏙옙占쏙옙 jsp 占쏙옙占쏙옙占쏙옙		
		List<BoardDto> list = boardService.getList(map);
		
		mv.addObject("totalCount", boardService.getTotalCount(map));
		
		//db 占쏙옙占쏙옙째占�
		mv.addObject("searchKey", searchKey);
		mv.addObject("searchWord", searchWord);
		mv.addObject("type", type);
		mv.addObject("list", list);
		mv.addObject("pg", pg);
		
		return mv;
	}
	
	@RequestMapping(value="/board/write")
	public ModelAndView boardWrite(BoardDto dto,String mode,String seq,String type,String board_list)
	{
				
		ModelAndView mv = new ModelAndView();
		dto = (BoardDto)boardService.getView(dto.getSeq());
		mv.setViewName("board/board_writeForm");
		mv.addObject("type",type);
		mv.addObject("mode", mode);
		mv.addObject("seq", seq);
		mv.addObject("board_list", board_list);
		mv.addObject("dto", dto);
		
		return mv;
	}
	
	@RequestMapping(value="/board/save")
	public ModelAndView boardSave(BoardDto dto,String mode,String seq,String type,String board_list,String group_id,String group_depth,String group_seq,String writer)
	{

		if(mode==null || mode.equals(""))
			mode="insert";
		if(mode.equals("insert"))
			boardService.insert(dto);
		else if(mode.equals("modify"))
			boardService.update(dto);	
		else 
		{
			
			dto.setGroup_id(group_id); 
			//나와 부모는 같은 그룹아이디를 갖는다 
			dto.setGroup_depth(Integer.toString((Integer.parseInt(group_depth)+1)));
			//내가 부모 글보다 하나 더 깊이 들어간다. 그래서 +1
			dto.setGroup_seq(Integer.toString((Integer.parseInt(group_seq)+1)));			
			boardService.reply(dto);	
		}		
//		System.out.println(group_depth+"depth");
//		System.out.println(group_seq+"seq");
//		System.out.println(group_id+"id");
		if(board_list==null || board_list.equals(""))
			board_list="list";
		if(type==null || type.equals(""))
			type="0";
		
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("board/board_list");
	//	System.out.println(type);
		mv.addObject("board_list", board_list);
		HashMap map = new HashMap();
		map.put("type", type);
		map.put("pg", "0");
		List<BoardDto> list = boardService.getList(map);
		
		mv.addObject("mode", mode);
		mv.addObject("type", type);
		mv.addObject("list", list);
		mv.addObject("totalCount", boardService.getTotalCount(map));
	
		return mv;
	}
	
	@RequestMapping(value="/board/zipcode")
	public ModelAndView getZipcodeList(String dong)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/zipcode");
		//호占쏙옙占쏙옙 jsp 占쏙옙占쏙옙占쏙옙
		
		HashMap map = new HashMap();
		map.put("dong", dong);
		
		List list 
		      = boardService.getZipcodeList(map);
		//db 占쏙옙占쏙옙째占�
		//requet.setAttribute 占쏙옙탓占�占싣뤄옙 占쌘듸옙 占쏙옙占쏙옙 
		mv.addObject("dong", dong);
		mv.addObject("list", list);
		return mv;
	}
	@RequestMapping(value="/board/view")
	public ModelAndView boardView(BoardDto dto,String seq,String board_list)
	{
	//	System.out.println(dto.getSeq());
	//	System.out.println(type);
	//	System.out.println(dto.getType());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/board_view");				
		dto = (BoardDto)boardService.getView(dto.getSeq());
//		System.out.println(seq);	
//		System.out.println(dto.getType());
//		System.out.println(dto.getGroup_depth());
//		System.out.println(dto.getGroup_seq());
//		System.out.println(dto.getGroup_id());
		
		mv.addObject("seq",seq);		
		mv.addObject("type",dto.getType());
		mv.addObject("dto", dto);
		return mv;
	}
	@RequestMapping(value="/board/update")
	public ModelAndView boardUpdate(BoardDto dto)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/board_list");
		
		boardService.update(dto);
		HashMap map = new HashMap();
		map.put("pg", "0");
		List<BoardDto> list = boardService.getList(map);
		//db 占쏙옙占쏙옙째占�
		mv.addObject("list", list);
		mv.addObject("totalCount", boardService.getTotalCount(map));
		return mv;
	}
	@RequestMapping(value="/board/del")
	public ModelAndView boardDelete(BoardDto dto,String type)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/board_list");
//		System.out.println(type);
		boardService.delete(dto);
	
		HashMap map = new HashMap();
		map.put("type", type);
		
		map.put("pg", "0");
		List<BoardDto> list = boardService.getList(map);
		//db 占쏙옙占쏙옙째占�
		
		mv.addObject("type", type);
		mv.addObject("list", list);
		mv.addObject("totalCount", boardService.getTotalCount(map));

		
		return mv;
	}
	@RequestMapping(value="/board/reply")
	public ModelAndView boardReply(BoardDto dto,String seq,String board_list,String mode)
	{

		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/board_writeForm");				
		dto = (BoardDto)boardService.getView(dto.getSeq());
		
//		System.out.println(seq);	
//		System.out.println(dto.getType());
		HashMap map = new HashMap();	
		mv.addObject("mode",mode);
		mv.addObject("seq",seq);		
		mv.addObject("type",dto.getType());
		mv.addObject("dto", dto);
		return mv;
	}


}
