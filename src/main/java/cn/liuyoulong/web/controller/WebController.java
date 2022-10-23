package cn.liuyoulong.web.controller;

import cn.liuyoulong.web.dto.User;
import cn.liuyoulong.web.service.WebService;
import cn.liuyoulong.web.vo.AddUserRequestVo;
import cn.liuyoulong.web.vo.Response;
import cn.liuyoulong.web.vo.UserVo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/getUsers")
    public Response getUsers(@RequestBody UserVo vo) {
        try {
            log.info("getUsers start: {}", vo);
            List<User> users = webService.getUsers(vo);
            log.info("getUsers end");
            return Response.ok(users);
        } catch (Exception e) {
            log.info("getUsers error: {}", e.getMessage());
            return Response.error(e.getMessage());
        }
    }

    @PostMapping("/addUsers")
    public Response addUsers(@RequestBody AddUserRequestVo vo) {
        try {
            log.info("addUsers start: {}", vo);
            boolean status = webService.addUsers(vo);
            log.info("addUsers end");
            return Response.ok(status);
        } catch (Exception e) {
            log.info("addUsers error: {}", e.getMessage());
            return Response.error(e.getMessage());
        }
    }
}
