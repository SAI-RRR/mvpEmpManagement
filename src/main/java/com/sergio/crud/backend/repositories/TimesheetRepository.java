package com.sergio.crud.backend.repositories;

import com.sergio.crud.backend.entities.Timesheet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {
}
