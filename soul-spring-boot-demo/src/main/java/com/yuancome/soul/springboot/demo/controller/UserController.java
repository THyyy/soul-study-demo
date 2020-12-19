package com.yuancome.soul.springboot.demo.controller;

import com.yuancome.soul.springboot.demo.dto.UserDTO;
import org.dromara.soul.client.springmvc.annotation.SoulSpringMvcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 *
 * @author tanheyuan
 * @since 2020/12/19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/create")
    @SoulSpringMvcClient(path = "/user/create", desc = "创建新用户")
    public String create(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO.toString());
        return "创建用户成功";
    }

    @GetMapping("/get")
    @SoulSpringMvcClient(path = "/user/get", desc = "获得用户详细")
    public UserDTO get(@RequestParam("id") Long id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(18);
        userDTO.setId(id);
        userDTO.setName("YuanCome");
        return userDTO;
    }
}
