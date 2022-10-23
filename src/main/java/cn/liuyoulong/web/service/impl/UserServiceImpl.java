package cn.liuyoulong.web.service.impl;

import cn.liuyoulong.web.dto.User;
import cn.liuyoulong.web.mapper.UserMapper;
import cn.liuyoulong.web.service.UserService;
import cn.liuyoulong.web.vo.UserVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> selectUser(UserVo userVo) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq(!StringUtils.isBlank(userVo.getName()), "name", userVo.getName());
        return userMapper.selectList(wrapper);
    }
}
