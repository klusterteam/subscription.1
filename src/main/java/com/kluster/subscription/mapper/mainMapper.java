package com.kluster.subscription.mapper;

import com.kluster.subscription.domain.service;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface mainMapper {

    List<service> getMainServiceList();
}
