package com.example.parkingslot.dao;

import com.example.parkingslot.entity.ParkingSpotDetails;
import com.example.parkingslot.entity.SlotOwnerDetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotDetailsRepo extends JpaRepository<ParkingSpotDetails, Integer>{

	@Query(value = "select u from ParkingSpotDetails u where u.slotowner = :empId")
	ParkingSpotDetails getAllocationForEmp(int empId);
}

