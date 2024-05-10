package com.chent.demo.service;

import com.chent.demo.Mapper.EmpInfoMapper;
import com.chent.demo.entity.EmpInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EmpInfoService {

    public List<EmpInfo> getEmpInfoList();
}
