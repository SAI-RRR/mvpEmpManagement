package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LeaveRequestDTO;
import com.app.entity.LeaveRequestEntity;
import com.app.service.LeaveRequestService;

@RestController
@RequestMapping("/leave/api")
public class LeaveRequestController {

	@Autowired
	private LeaveRequestService leaveRequestService;
	
	@PostMapping("/createleave")
	public LeaveRequestEntity createLeave(@RequestBody LeaveRequestDTO leaveRequestdto) {
		return leaveRequestService.addLeaveRequest(leaveRequestdto);
	}


}
