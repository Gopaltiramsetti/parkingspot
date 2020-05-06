package com.example.parkingslot.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parkingslot.dao.SlotOwnerDetailRepo;
import com.example.parkingslot.entity.SlotOwnerDetail;
import com.example.parkingslot.processor.ParkingSlotRaffleProcessor;
import com.example.parkingslot.vo.SlotDetails;

@Service
public class SlotOwnerDetailService {
	
	@Autowired
	private SlotOwnerDetailRepo detailRepo;
	
	@Autowired
	private ParkingSlotRaffleProcessor parkingSlotRaffleProcessor;
	
	public SlotDetails getAllocatedSlot()
	{
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		List<SlotOwnerDetail> details = detailRepo.getSlotOwnerDetails(date);
		
		
		return parkingSlotRaffleProcessor.getAllocateDetails(details);
		
		
			
	}
	

}
