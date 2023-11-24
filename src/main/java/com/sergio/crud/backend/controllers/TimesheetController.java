package com.sergio.crud.backend.controllers;

import com.sergio.crud.backend.dtos.TimesheetDto;

import com.sergio.crud.backend.services.TimesheetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TimesheetController {
@Autowired
    private TimesheetService timesheetService;

    @GetMapping("/timesheets")
    public ResponseEntity<List<TimesheetDto>> allTimesheets() {
        return ResponseEntity.ok(timesheetService.allTimesheets());
    }

    @PostMapping("/timesheets")
    public ResponseEntity<TimesheetDto> createTimesheet(@Valid @RequestBody TimesheetDto timesheetDto) {
        TimesheetDto createdTimesheet = timesheetService.createTimesheet(timesheetDto);
        return ResponseEntity.created(URI.create("/timsheets/" + timesheetDto.getId())).body(createdTimesheet);
    }

    @GetMapping("/timesheets/{id}")
    public ResponseEntity<TimesheetDto> getTimesheet(@PathVariable Long id) {
        return ResponseEntity.ok(timesheetService.getTimesheet(id));
    }

    @PutMapping("/timesheets/{id}")
    public ResponseEntity<TimesheetDto> updateTimesheet(@PathVariable Long id, @Valid @RequestBody TimesheetDto timesheetDto) {
        return ResponseEntity.ok(timesheetService.updateTimesheet(id, timesheetDto));
    }



    @DeleteMapping("/timesheets/{id}")
    public ResponseEntity<TimesheetDto> deleteTimesheet(@PathVariable Long id) {
        return ResponseEntity.ok(timesheetService.deleteTimesheet(id));
    }
}
