package com.api.service;


import com.api.dao.ApiDao;
import com.api.rpc.IApiService;
import com.api.common.model.pojo.ApiKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: XFW
 * @version:
 * @create: 2019-01-31 13:38
 **/
@Service
public class ApiServiceImpl implements IApiService {
    @Override
    public String apiTest() {
        return "service.ApiServiceImpl";
    }
// private final static Logger log = Logger.getLogger(ApikeyServiceImpl.class);

    @Autowired
    private ApiDao apiDao;

    @Override
    public List<ApiKey> selectList() {
        List<ApiKey> apikeys = new ArrayList<>();
        try {
            apikeys = apiDao.selectList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return apikeys;
    }
    @Override
    public ApiKey selectListById(String Id) {
        ApiKey api = new ApiKey();
        try {
            api = apiDao.selectListById(Id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return api;
    }
    @Override
    public List<ApiKey> selectListByName(String name) {
        List<ApiKey> apikeys = new ArrayList<>();
        try {
            apikeys = apiDao.selectListByName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return apikeys;
    }
    @Override
    public ApiKey selectListByVerify(String name, String password, String type) {
        ApiKey api = new ApiKey();
        try {
            api = apiDao.selectListByVerify(name, password, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return api;
    }
}
