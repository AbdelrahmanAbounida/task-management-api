package com.abonedatech.taskmanagement.v1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.abonedatech.taskmanagement.v1.constant.AppConstants.PREFIX_ENDPOINT;

@RestController
public class TaskController {

    @GetMapping(PREFIX_ENDPOINT)
    public String get_tasks(){
        return "Hello World asd";
    }
}
