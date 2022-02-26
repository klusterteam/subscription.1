package com.kluster.subscription.mapper;

import com.kluster.subscription.domain.Service;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {

    List<Service> getMainServiceList();
}
