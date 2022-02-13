package com.example.demo.Controller;

import com.example.demo.entity.Stu;
import com.example.demo.service.StuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StuController {

    @Resource(name = "stuService001")
    private StuService stuService;

    @GetMapping("/getStuById/{id}")
    public Stu getStuById(@PathVariable Integer id){
        return stuService.queryStuInfo(id);
    }
}
