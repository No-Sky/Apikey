package com.api.rpc;

import com.api.common.model.pojo.ApiKey;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: XFW
 * @version:
 * @create: 2019-01-31 13:40
 **/
@Service
public interface IApiService {

    String apiTest();

    List<ApiKey> selectList();

    ApiKey selectListById(String Id);

    List<ApiKey> selectListByName(String name);

    ApiKey selectListByVerify(String name, String password, String type);
}
