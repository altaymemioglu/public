package com.hotel.app;

import java.util.ArrayList;
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
	
	public CheckIn[] getCheckIn(Employee employee){
		List<CheckIn> checkIns = new ArrayList<CheckIn>();
		if(employee!=null && employee.getId()>0)
			checkIns = checkInRepository.findByEmployeeId(employee.getId());
	    return checkIns.toArray(new CheckIn[checkIns.size()]);
	}
}
