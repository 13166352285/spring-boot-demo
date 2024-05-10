package com.chent.demo.Mapper;

import com.chent.demo.entity.EmpInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface EmpInfoMapper {
    List<EmpInfo> getAllEmp();
}
