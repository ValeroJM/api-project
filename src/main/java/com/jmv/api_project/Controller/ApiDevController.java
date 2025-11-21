package com.jmv.api_project.Controller;

import com.jmv.api_project.Model.Response.MobileResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.jmv.api_project.Config.ApiConfig.API_URL;

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

    @GetMapping("/getStatus")
    public String getStatus(){
        String uri = "http://localhost:8080/api/status";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    //Info found in: https://www.geeksforgeeks.org/java/how-to-call-or-consume-external-api-in-spring-boot/
    @GetMapping("/mobilesList")
    public List<MobileResponse> getMobiles(){
        RestTemplate restTemplate = new RestTemplate();
        MobileResponse[] mobileResponseList = restTemplate.getForObject(API_URL, MobileResponse[].class);
        return List.of(mobileResponseList);
    }
}
