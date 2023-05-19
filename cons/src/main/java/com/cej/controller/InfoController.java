package com.cej.controller;

import com.cej.rpcService.ProvService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Resource
    private ProvService provService;

    @GetMapping("/getInfo/{id}")
    public String get(@PathVariable("id") String id){
        return provService.getInfo(id);
    }
}
