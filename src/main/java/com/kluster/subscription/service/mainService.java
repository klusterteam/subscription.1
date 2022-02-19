package com.kluster.subscription.service;

import com.kluster.subscription.domain.service;
import com.kluster.subscription.mapper.mainMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class mainService {

    private final mainMapper mainMapper;

    public mainService(mainMapper mainMapper){
        this.mainMapper = mainMapper;
    }

    public List<service> getMainServiceList(){
        return mainMapper.getMainServiceList();
    }

}
