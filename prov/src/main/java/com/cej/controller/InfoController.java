package com.cej.controller;

import com.cej.service.Ac01Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("info")
public class InfoController {

    @Resource
    private Ac01Service ac01Service;

    @GetMapping("get/{id}")
    public String getInfo(@PathVariable("id")String id){
        return ac01Service.load(id).toString();
    }
}
