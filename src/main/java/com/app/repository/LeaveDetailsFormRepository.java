package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.entity.LeaveDetailsFormEntity;

public interface LeaveDetailsFormRepository extends JpaRepository<LeaveDetailsFormEntity, Integer> {

	//public List<LeaveDetailsFormDTO> add(LeaveDetailsFormDTO leavedtls);

}
