package com.example.parkingslot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParkingSpotDetails {
	@Id
	private int spotid;
	@Column
	private int spotnum;
	@Column
	private String block;
	@Column
	private String wing;
	@Column
	private int  slotowner;
	public int getSpotid() {
		return spotid;
	}
	public void setSpotid(int spotid) {
		this.spotid = spotid;
	}
	public int getSpotnum() {
		return spotnum;
	}
	public void setSpotnum(int spotnum) {
		this.spotnum = spotnum;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getWing() {
		return wing;
	}
	public void setWing(String wing) {
		this.wing = wing;
	}
	public int getSlotowner() {
		return slotowner;
	}
	public void setSlotowner(int slotowner) {
		this.slotowner = slotowner;
	}
	
	
	
	
	
	

}
