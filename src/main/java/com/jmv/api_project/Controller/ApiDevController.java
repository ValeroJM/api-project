package com.jmv.api_project.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
    public List<Object> getMobiles(){
        String url = "https://api.restful-api.dev/objects";
        RestTemplate restTemplate = new RestTemplate();
        Object[] mobiles = restTemplate.getForObject(url, Object[].class);

        return Arrays.asList(mobiles);
    }
}
