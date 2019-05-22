package com.hotel.app;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.data.CheckOut;
import com.hotel.data.Employee;
import com.hotel.repository.CheckOutRepository;

@Component
@Transactional
public class CheckOutBean {
	
	@Autowired
	CheckOutRepository checkOutRepository;
	
	public CheckOut[] getCheckOut(Employee employee){
		List<CheckOut> checkOuts = new ArrayList<CheckOut>();
		if(employee!=null && employee.getId()>0)
			checkOuts = checkOutRepository.findByEmployeeId(employee.getId());
	    return checkOuts.toArray(new CheckOut[checkOuts.size()]);
	}

}
