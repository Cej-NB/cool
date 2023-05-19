package com.cej.rpcService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "prov")
public interface ProvService {
    @RequestMapping(value = "/info/get/{id}",method = RequestMethod.GET)
    public String getInfo(@PathVariable("id")String id);
}
