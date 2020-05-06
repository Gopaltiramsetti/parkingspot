package com.example.parkingslot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parkingslot.service.SlotOwnerDetailService;
import com.example.parkingslot.vo.SlotDetails;

@RestController
@RequestMapping(value = "/parkingslot")
public class ParkingSpotController {
	
	@Autowired
	private SlotOwnerDetailService ownerDetailService;

	public SlotDetails allocateSlotForEmp(String empId)
	{
		
		return ownerDetailService.getAllocatedSlot();
		
	}
	

	

}
