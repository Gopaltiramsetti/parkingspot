package com.example.parkingslot.processor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.parkingslot.dao.ParkingAllocationRepo;
import com.example.parkingslot.dao.ParkingSpotDetailsRepo;
import com.example.parkingslot.entity.ParkingSpotDetails;
import com.example.parkingslot.entity.SlotOwnerDetail;
import com.example.parkingslot.vo.SlotDetails;

@Component
public class ParkingSlotRaffleProcessor {

	@Autowired
	private ParkingSpotDetailsRepo parkingSpotDetailsRepo;
	
	public SlotDetails getAllocateDetails(List<SlotOwnerDetail> details)
	{
		int empId = 0;
		
		if(details != null && !details.isEmpty())
		{
			SlotOwnerDetail d = details.get(0);
			
			empId = d.getSlotowner();
		}
		
		ParkingSpotDetails parkingSpotDetails = parkingSpotDetailsRepo.getAllocationForEmp(empId);
		
		SlotDetails detail = new SlotDetails();
		
		detail.setBuildNumber(parkingSpotDetails.getBlock());
		detail.setSlotNumber(parkingSpotDetails.getSpotnum());
		return detail;
		
	}
	
}
