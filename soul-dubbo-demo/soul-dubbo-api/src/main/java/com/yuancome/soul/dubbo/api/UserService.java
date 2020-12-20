package com.yuancome.soul.dubbo.api;

import com.yuancome.soul.dubbo.api.dto.UserDTO;

/**
 * 用户服务接口
 *
 * @author yuancome
 * @date 2020/12/20
 */

public interface UserService {

    /**
     * 根据用户 id 获取用户信息
     *
     * @param id 用户 id
     * @return
     */
    UserDTO getUser(Long id);

    /**
     * 创建新的用户
     *
     * @param userDTO
     * @return
     */
    UserDTO createUser(UserDTO userDTO);
}
