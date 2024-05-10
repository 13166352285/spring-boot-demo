package com.chent.demo.service.impl;

import com.chent.demo.Mapper.EmpInfoMapper;
import com.chent.demo.entity.EmpInfo;
import com.chent.demo.service.EmpInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpInfoServiceImpl implements EmpInfoService {
    @Autowired
    EmpInfoMapper empInfoMapper;

    @Override
    public List<EmpInfo> getEmpInfoList() {
        return empInfoMapper.getAllEmp();
    }
}
