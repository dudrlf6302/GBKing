package com.hanbat.menu.dto;

public class MenuDto {

	private int seq;
	private int menu_mod;
	private int price;
	private double point;
	private String contents="";
	private String delYn="";
	private String image="";
	private String menu_name="";
	private String wdate="";
	 
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getMenu_mod() {
		return menu_mod;
	}
	public void setMenu_mod(int menu_mod) {
		this.menu_mod = menu_mod;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

}


