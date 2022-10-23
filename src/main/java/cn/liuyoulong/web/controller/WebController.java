package cn.liuyoulong.web.controller;

import cn.liuyoulong.web.dto.User;
import cn.liuyoulong.web.service.WebService;
import cn.liuyoulong.web.vo.Response;
import cn.liuyoulong.web.vo.UserVo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/web")
public class WebController {

    @Resource
    WebService webService;

    @GetMapping("/getUsers")
    public Response getUsers(UserVo userVo) {
        try {
            log.info("getUsers start: {}", userVo);
            List<User> users = webService.getUsers(userVo);
            log.info("getUsers end");
            return Response.ok(users);
        } catch (Exception e) {
            log.info("getUsers: {}", e.getMessage());
            return Response.error(e.getMessage());
        }
    }
}
