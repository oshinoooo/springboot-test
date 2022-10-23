package cn.liuyoulong.web.service;

import cn.liuyoulong.web.dto.User;
import cn.liuyoulong.web.vo.UserVo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> selectUser(UserVo vo);
}
