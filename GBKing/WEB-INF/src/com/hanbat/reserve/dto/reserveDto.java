package com.hanbat.reserve.dto;

public class reserveDto {
	
	private int seq;
	private int roomNum;
	private String ID="";
	private String currDDay="";
	private String currTime="";	
	private String wdate="";
	private String delyn="";
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCurrDDay() {
		return currDDay;
	}
	public void setCurrDDay(String currDDay) {
		this.currDDay = currDDay;
	}
	public String getCurrTime() {
		return currTime;
	}
	public void setCurrTime(String currTime) {
		this.currTime = currTime;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getDelyn() {
		return delyn;
	}
	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}
	
	
	

}
