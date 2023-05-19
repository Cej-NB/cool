package com.cej.service.impl;

import com.cej.abase.domain.Ac01;
import com.cej.abase.repository.Ac01Repository;
import com.cej.service.Ac01Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Ac01ServiceImpl implements Ac01Service {

    @Resource
    protected Ac01Repository ac01Repository;

    @Override
    public Ac01 load(String id) {
        return ac01Repository.getOne(id);
    }
}
