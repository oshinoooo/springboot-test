package cn.liuyoulong.web.service.impl;

import cn.liuyoulong.web.dto.User;
import cn.liuyoulong.web.service.UserService;
import cn.liuyoulong.web.service.WebService;
import cn.liuyoulong.web.vo.AddUserRequestVo;
import cn.liuyoulong.web.vo.UserVo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

@Slf4j
@Service
public class WebServiceImpl implements WebService {

    @Resource
    UserService userService;

    @Override
    public List<User> getUsers(UserVo vo) {
        return userService.selectUser(vo);
    }

    @Override
    public boolean addUsers(AddUserRequestVo vo) {
        return userService.saveBatch(vo.getUsers());
    }
}
