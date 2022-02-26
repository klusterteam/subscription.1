package com.kluster.subscription.service;

import com.kluster.subscription.domain.Service;
import com.kluster.subscription.mapper.MainMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@Transactional
public class MainService {

    private final MainMapper mainMapper;

    public MainService(MainMapper mainMapper){
        this.mainMapper = mainMapper;
    }

    public List<Service> getMainServiceList(){
        return mainMapper.getMainServiceList();
    }

}
