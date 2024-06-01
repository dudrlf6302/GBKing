package com.hanbat.board.dto;

public class BoardDto {

	private String num="";
	private String seq="";
	private String title="";
	private String contents="";
	private String writer="";
	private String wdate="";
	private int hit=0;
	private String delYn="";
	String group_id="";
	String group_seq="";
	String group_depth="";
	String type="";
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getGroup_seq() {
		return group_seq;
	}
	public void setGroup_seq(String group_seq) {
		this.group_seq = group_seq;
	}
	public String getGroup_depth() {
		return group_depth;
	}
	public void setGroup_depth(String group_depth) {
		this.group_depth = group_depth;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	
}


