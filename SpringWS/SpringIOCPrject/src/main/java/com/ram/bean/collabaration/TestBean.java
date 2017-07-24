package com.ram.bean.collabaration;

public class TestBean {
	String msg;
	public void setMsg(String msg)
	{
		System.out.println("TestBean setMsg() method");
		this.msg=msg;
	}
	
	public String toString()
	{
		return "testbean msg  :"+msg;
	}

}
