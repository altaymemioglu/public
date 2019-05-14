package com.hotel.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.app.data.CheckIn;
import com.hotel.app.data.Employee;
import com.hotel.app.data.repository.CheckInRepository;

@Component
@Transactional
public class CheckInBean {
	
	@Autowired
	CheckInRepository checkInRepository;
	
	public CheckIn[] getCheckIn(Long... id){
		List<CheckIn> checkIns = new ArrayList<CheckIn>();
		if(id!=null && id.length>0)
			checkInRepository.findAllById(Arrays.asList(id)).forEach(ch->checkIns.add(ch));
		else
			checkInRepository.findAll().forEach(ch->checkIns.add(ch));
	    return checkIns.toArray(new CheckIn[checkIns.size()]);		
	}
	
	public CheckIn[] getCheckIn(Employee employee){
		List<CheckIn> checkIns = new ArrayList<CheckIn>();
		if(employee!=null && employee.getId()>0)
			checkIns = checkInRepository.findByEmployeeId(employee.getId());
	    return checkIns.toArray(new CheckIn[checkIns.size()]);
	}
}
