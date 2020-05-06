package com.example.parkingslot.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="slot_Owner_Detail")
public class SlotOwnerDetail {
	@Id
	private int id;
	@Column
	private int slotowner;
	@Column
	private Date leaveToDate;
	@Column
	private Date leaveFromDate;
	
	
	
	public Date getLeaveFromDate() {
		return leaveFromDate;
	}
	public void setLeaveFromDate(Date leaveFromDate) {
		this.leaveFromDate = leaveFromDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSlotowner() {
		return slotowner;
	}
	public void setSlotowner(int slotowner) {
		this.slotowner = slotowner;
	}
	public Date getLeaveToDate() {
		return leaveToDate;
	}
	public void setLeaveToDate(Date leaveToDate) {
		this.leaveToDate = leaveToDate;
	}
	
	
	

}
