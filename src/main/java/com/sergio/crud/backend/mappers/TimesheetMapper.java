package com.sergio.crud.backend.mappers;

import com.sergio.crud.backend.dtos.TimesheetDto;

import com.sergio.crud.backend.entities.Timesheet;

import com.sergio.crud.backend.services.TimesheetService;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TimesheetMapper {

    Timesheet toTimesheet(TimesheetDto timesheetDto);

    TimesheetDto toTimesheetDto(Timesheet timesheet);

    List<TimesheetDto> toTimesheetDtos(List<Timesheet> timesheets);

    void updateTimesheet(@MappingTarget Timesheet target, Timesheet source);
}
