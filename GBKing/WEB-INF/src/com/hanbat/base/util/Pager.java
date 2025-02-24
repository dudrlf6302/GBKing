package com.hanbat.base.util;

import javax.servlet.http.HttpServletRequest;

public class Pager {
	
	private int pg ; 
	
	private int totalCnt ;
	
	
	
	public static String makeTag(HttpServletRequest request , int pageSize , int total) {
		String Tag = "" ; 
		
		int cpage; 

		int pageTotal; 
		int pageGroupSize = 5;
		int pageGroupStart; 
		int pageGroupEnd; 
		
		String path="";
		//System.out.println(path);
		String beginLabel 	= "<img src='/GBKing/images/pg_first.gif' border=0 align='absmiddle'>";
		String prevLabel 	= "<img src='/GBKing/images/pg_prev.gif' border='0'  align='absmiddle'>\n";
		String nextLabel 	= "<img src='/GBKing/images/pg_next.gif' border='0' align='absmiddle'>";
		String endLabel 	= "<img src='/GBKing/images/pg_last.gif' border=0 align='absmiddle'>\n";	

		try {

			StringBuffer sb = new StringBuffer();
			
			String page = request.getParameter("pg") ;
			if(page==null || page.equals(""))
				page="0";
			
			//page = ( page == null ) ? "0" : page ; 
			
//			setPg(Integer.parseInt(page)) ; 
//			setTotalCnt(Integer.parseInt(totCnt)) ; 
	
			cpage = Integer.parseInt(page) ; 

			pageTotal = (total - 1) / pageSize;

			pageGroupStart = (int) (cpage / pageGroupSize) * pageGroupSize;
			
			pageGroupEnd = pageGroupStart + pageGroupSize;
			if (pageGroupEnd > pageTotal) {
				pageGroupEnd = pageTotal + 1;
			}
			boolean hasPreviousPage = true;//cpage - pageGroupSize >= 0;
			boolean hasNextPage = true;// pageGroupStart + pageGroupSize < pageTotal;
			
			sb.append("<table border=0 cellspacing=0 cellpadding=0 align='center'>\r\n") ; 
			sb.append("<tr><td style='padding-left:10px'>\r\n") ;
			sb.append("&nbsp");
			sb.append((cpage > 0) ? makeLink(0, beginLabel) : beginLabel);
			sb.append("&nbsp");
			sb.append("</td>\r\n") ;  
			sb.append("<td>\r\n") ;
			sb.append("&nbsp");
			sb.append(hasPreviousPage ? makeLink(pageGroupStart - 1, prevLabel) : prevLabel);
			sb.append("&nbsp");
			sb.append("</td>\r\n") ;  
		
			for (int i = pageGroupStart; i < pageGroupEnd; i++) {
				if (i == cpage) {
					sb.append("<td style='padding-left:10px'>\r\n") ; 
					sb.append("<font color='#F47906'>");
					sb.append("<b>").append(i + 1).append("</b>");
					sb.append("</font>");
					sb.append("</td>\r\n") ;  
				} else {
					sb.append("<td style='padding-left:10px'>\r\n") ; 
					sb.append(makeLink(i, (i + 1) + ""));
					sb.append("</td>\r\n") ;  
				}
			}
			
			sb.append("<td style='padding-left:10px'>\r\n") ; 
			sb.append("&nbsp");
			sb.append(hasNextPage ? makeLink(pageGroupEnd, nextLabel) : nextLabel);
			sb.append("&nbsp");
			sb.append("</td>\r\n") ;  
			sb.append("<td>\r\n") ;
			sb.append("&nbsp");
			sb.append((cpage < pageTotal) ? makeLink(pageTotal, endLabel) : endLabel);
			sb.append("&nbsp");
			sb.append("</td></tr>\r\n") ;  
			sb.append("</table>") ;
			Tag = sb.toString() ; 	
		} catch ( Exception e ) {
			e.printStackTrace() ; 
		}
		
			
		return Tag ; 
	}

	public static String makeLink(int page, String label) 
	{
		StringBuffer tmp = new StringBuffer();
		tmp.append("<a href=\"javascript:goPage('" + page + "')\">").append(label).append("</a>");
		return tmp.toString();
	}
	
	
	
	
	public void setPg(int pg) {
		this.pg = pg ; 
	}
	
	public int getPg() {
		return pg ; 
	}
	
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt ; 
	}
	
	public int getTotalCnt() {
		return totalCnt ; 
	}
}
