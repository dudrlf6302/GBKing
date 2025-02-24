package com.hanbat.reserve.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hanbat.reserve.dto.reserveDto;
import com.hanbat.reserve.service.IreserveService;

//������̼��� ���� �� Ŭ������ ��Ʈ�ѷ����� �˸���.
@Controller
public class reserveController {

	@Autowired//�̸����� ã�Ƽ� �����϶�
	private IreserveService reserveService;

	HashMap<String, String> map = new HashMap();
	reserveDto dto = new reserveDto();
	
	//url - ~~/member/list.do ȣ���ϸ� /member/member_list.jsp�������� ȣ��ȴ�.
	@RequestMapping(value="/reserve/reserve")
	public ModelAndView reserve(String ID, String mode, String currYear, String currMonth, String currDay, String currTime, String roomNum)
	{
		ModelAndView mv = new ModelAndView();

		// Global Vars
		int viewMode = 0;  // incoming request for moving calendar up(1) down(0) for month
		
		int currYearC = 0; // if it is not retrieved from incoming URL (month=) then it is set to current year
		int currMonthC = 0; // same as year
		int currDayC = 0;
		int roomNumC=0;
		String currTimeC="";

		//build 2 calendars

		Calendar c = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();

		
		if (mode == null) // Check to see if we should set the year and month to the current
		{
			currMonthC = c.get(c.MONTH);
			currYearC = c.get(c.YEAR);
			cal.set(currYearC, currMonthC,1);
		}

		else
		{
			if (!(mode == null)) // Hove the calendar up or down in this if block
			{
			
				
				currYearC = Integer.parseInt(currYear);
				currMonthC = Integer.parseInt(currMonth);
									
				if (Integer.parseInt(mode) == 1)
				{
					cal.set(currYearC, currMonthC, 1);
					cal.add(cal.MONTH, 1);
					currMonthC = cal.get(cal.MONTH);
					currYearC = cal.get(cal.YEAR);
				}
				else if (Integer.parseInt(mode) == 0 )
				{
					cal.set(currYearC, currMonthC ,1);
					cal.add(cal.MONTH, -1);
					currMonthC = cal.get(cal.MONTH);
					currYearC = cal.get(cal.YEAR);
				}
				else if (Integer.parseInt(mode) == 2 )
				{
					
					currDayC = Integer.parseInt(currDay);
					
					viewMode=1;
					cal.set(currYearC, currMonthC,1);
				}
				
				else if (Integer.parseInt(mode) == 3 )
				{
					mv.addObject("list",  reserveService.getList(map));
					
					currDayC = Integer.parseInt(currDay);
					roomNumC = Integer.parseInt(roomNum);
										
					viewMode=2;
					cal.set(currYearC, currMonthC, 1);
					
				}
				
				else if (Integer.parseInt(mode) == 4 )
				{
					mv.addObject("list",  reserveService.getList(map));

					currDayC = Integer.parseInt(currDay);
					roomNumC = Integer.parseInt(roomNum);
					currTimeC = currTime;
					String currDDay= Integer.toString(currYearC)+" "+Integer.toString(currMonthC+1)+" "+Integer.toString(currDayC);
					
					dto.setRoomNum(roomNumC);
					dto.setCurrDDay(currDDay);
					dto.setCurrTime(currTimeC);
					dto.setID(ID);
					
					reserveService.insert(dto);
									
					
					mv.addObject("currDDay",  currDDay);
					mv.addObject("currTime",  currTimeC);
					mv.addObject("roomNum",  roomNumC);
					mv.setViewName("reserve/reserveFinish");
					//ȣ���� jsp ������
					return mv;
				}
				
			}
		} 
		
		mv.setViewName("reserve/reserve");
		//ȣ���� jsp ������


		mv.addObject("currYear",  currYearC);
		mv.addObject("currMonth",  currMonthC);
		mv.addObject("currDay",  currDayC);
		mv.addObject("roomNum",  roomNumC);
		mv.addObject("c",  c);
		mv.addObject("cal",  cal);
		mv.addObject("viewMode",  viewMode);

		return mv;
	}
	

	@RequestMapping(value="/reserve/reserveConfirm")
	public ModelAndView reserveConfirm(String searchKey, String searchWord)
	{
		map.put("searchKey", searchKey);
		map.put("searchWord", searchWord);
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list",  reserveService.reserveConfirm(map));
		mv.setViewName("reserve/reserveConfirm");
		return mv;
	}
	
	@RequestMapping(value="/reserve/confirmCancel")
	public ModelAndView confirmCancel(String seq)
	{		
		ModelAndView mv = new ModelAndView();
		dto.setSeq(Integer.parseInt(seq));
		reserveService.cancel(dto);

		mv.addObject("list",  reserveService.reserveConfirm(map));
		mv.setViewName("reserve/reserveConfirm");
		return mv;
	}
	
	@RequestMapping(value="/reserve/reserveList")
	public ModelAndView reserveList(String searchKey, String searchWord)
	{				
		map.put("searchKey", searchKey);
		map.put("searchWord", searchWord);
		
		ModelAndView mv = new ModelAndView();

		mv.addObject("list",  reserveService.getList(map));
		mv.setViewName("reserve/reserveList");
		return mv;
	}

	@RequestMapping(value="/reserve/listCancel")
	public ModelAndView listCancel(String seq)
	{		
		ModelAndView mv = new ModelAndView();
		
		dto.setSeq(Integer.parseInt(seq));
		reserveService.cancel(dto);

		mv.addObject("list",  reserveService.getList(map));
		mv.setViewName("reserve/reserveList");
		return mv;
	}

	

}
