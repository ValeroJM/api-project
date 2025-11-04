package com.jmv.api_project.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping(path= "/api")
public class ApiDevController {

    @GetMapping("/status")
    public String status(){
        Calendar calendar = Calendar.getInstance();
        Date calendarDate = calendar.getTime();
        return "OK - " + calendarDate;
    }
}
