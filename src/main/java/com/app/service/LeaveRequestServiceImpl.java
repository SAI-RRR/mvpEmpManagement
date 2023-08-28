package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.LeaveRequestDTO;
import com.app.entity.LeaveRequestEntity;
import com.app.repository.LeaveRequestRepository;

@Service
public class LeaveRequestServiceImpl implements LeaveRequestService {

	@Autowired
	private LeaveRequestRepository leaveRequestRepository;
	
	@Override
	public LeaveRequestEntity addLeaveRequest(LeaveRequestDTO leaveRequestdto) {
		LeaveRequestEntity leaveRequestEntity=new LeaveRequestEntity();
		leaveRequestEntity.setEmpname(leaveRequestdto.getEmpName());
		leaveRequestEntity.setEmpreason(leaveRequestdto.getReason());
		leaveRequestEntity.setLeaveType(leaveRequestdto.getLeaveType());
		leaveRequestEntity.setEmpStartDate(leaveRequestdto.getStartDate());
		leaveRequestEntity.setEmpEndDate(leaveRequestdto.getEndDate());
		return leaveRequestRepository.save(leaveRequestEntity);
	}

}
