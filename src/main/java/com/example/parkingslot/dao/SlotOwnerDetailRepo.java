package com.example.parkingslot.dao;

import com.example.parkingslot.entity.ParkingAllocation;
import com.example.parkingslot.entity.SlotOwnerDetail;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotOwnerDetailRepo extends JpaRepository<SlotOwnerDetail, Integer>{

	
	@Query(value = "select u from SlotOwnerDetail u where :todayDate between u.leaveFromDate and u.leaveToDate")
	List<SlotOwnerDetail> getSlotOwnerDetails(String todayDate);
}

