package com.choa.notice;

import java.sql.Date;

public class NoticeDTO {
	private int num;
	private String writer;
	private String title;
	private String contents;
	private int counts;
	private int reg_data;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
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

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}

	public int getReg_data() {
		return reg_data;
	}

	public void setReg_data(Date date) {
		this.reg_data = reg_data;
	}

}
