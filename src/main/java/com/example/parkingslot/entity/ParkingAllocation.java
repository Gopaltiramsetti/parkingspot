package com.example.parkingslot.entity;

import javax.persistence.Entity;

@Entity
public class ParkingAllocation {
private int id;
private int parkingid;
private int empid ;

private  String allocated;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getParkingid() {
	return parkingid;
}

public void setParkingid(int parkingid) {
	this.parkingid = parkingid;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getAllocated() {
	return allocated;
}

public void setAllocated(String allocated) {
	this.allocated = allocated;
}


	

}
