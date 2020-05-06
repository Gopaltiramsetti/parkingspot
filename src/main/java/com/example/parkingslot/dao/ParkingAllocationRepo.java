package com.example.parkingslot.dao;

import com.example.parkingslot.entity.ParkingAllocation;
import com.example.parkingslot.entity.ParkingSpotDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingAllocationRepo extends JpaRepository<ParkingAllocation, Integer>{


	
}

