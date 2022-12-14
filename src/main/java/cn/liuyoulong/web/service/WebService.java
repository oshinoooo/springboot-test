package cn.liuyoulong.web.service;

import cn.liuyoulong.web.dto.User;
import cn.liuyoulong.web.vo.AddUserRequestVo;
import cn.liuyoulong.web.vo.UserVo;

import java.util.List;

public interface WebService {

    List<User> getUsers(UserVo vo);

    boolean addUsers(AddUserRequestVo vo);
}
