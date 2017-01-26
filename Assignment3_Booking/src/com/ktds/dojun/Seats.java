package com.ktds.dojun;

public class Seats {
	
	private String seatClass;
	private int seatValue;
	
	public Seats(String itemName,int itemValue){
		this.seatClass=itemName;
		this.seatValue=itemValue;
	}
	public Seats(){
		seatClass="noName";
		seatValue=0;
	}
	public void setMenuItem(String itemName){
			this.seatClass=itemName;
	}
	public void setMenuitemValue(int itemValue){
			this.seatValue=itemValue;
	}
	public String getItemName(){
		return seatClass;
	}
	public String getItemValueWon(){
		return seatValue+"원";
	}
	public int getItemValue(){
		return seatValue;
	}
	
	
}
