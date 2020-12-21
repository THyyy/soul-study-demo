package com.yuancome.soul.dubbo.service.impl;

import com.yuancome.soul.dubbo.api.UserService;
import com.yuancome.soul.dubbo.api.dto.UserDTO;
import org.apache.dubbo.config.annotation.Service;
import org.dromara.soul.client.common.annotation.SoulClient;
import org.springframework.stereotype.Component;

/**
 * 用户服务接口实现类
 *
 * @author yuancome
 * @date 2020/12/20
 */
@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    @SoulClient(path = "/user/get", desc = "获取用户详细信息")
    public UserDTO getUser(Long id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(18);
        userDTO.setId(id);
        userDTO.setName("YuanCome");
        return userDTO;
    }

    @Override
    @SoulClient(path = "/user/create", desc = "创建新的用户")
    public UserDTO createUser(UserDTO userDTO) {
        System.out.println(userDTO.toString());
        return userDTO;
    }
}
