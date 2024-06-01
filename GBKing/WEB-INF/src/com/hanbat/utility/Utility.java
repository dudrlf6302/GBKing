package com.hanbat.utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utility {
	public String getDate()
	{
		GregorianCalendar gc = new GregorianCalendar();
        long milis = gc.getTimeInMillis();// 밀리초로 바꿔준다
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss"); // 기본 데이타베이스 저장 타입
        Date d = gc.getTime(); // Date -> util 패키지
        String str = sf.format(d);
        return str;
	}
	
	public double getPoint(int price)
	{
		double point = price * 0.05;
		return point;
	}

}

