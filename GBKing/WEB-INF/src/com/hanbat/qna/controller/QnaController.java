package com.hanbat.qna.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//어노테이션을 통해 이 클래스가 컨트롤러임을 알린다. 
@Controller
public class QnaController {

	@RequestMapping(value="/qna/qna")
	public ModelAndView qna()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/qna/qna");
		//호출할 jsp 페이지
		return mv;
	}

}
