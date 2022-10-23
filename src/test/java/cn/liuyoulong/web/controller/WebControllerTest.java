package cn.liuyoulong.web.controller;

import cn.liuyoulong.web.dto.User;
import cn.liuyoulong.web.service.WebService;
import cn.liuyoulong.web.vo.Response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
public class WebControllerTest {

    @Mock
    WebService webService;

    @InjectMocks
    WebController webController;

    @BeforeEach
    public void before() {
        User user = new User();
        user.setName("name");
        user.setEmail("email");
        Mockito.when(webService.getUsers(any())).thenReturn(Collections.singletonList(user));
        Mockito.when(webService.addUsers(any())).thenReturn(true);
    }

    @Test
    void getUsersTest() {
        Response response = webController.getUsers(any());
        Assertions.assertNotNull(response);
        List<User> users = (List<User>)response.getData();
        Assertions.assertEquals(users.get(0).getName(), "name");
        Assertions.assertEquals(users.get(0).getEmail(), "email");
    }

    @Test
    void addUsersTest() {
        Response response = webController.addUsers(any());
        Assertions.assertNotNull(response);
        boolean status = (boolean)response.getData();
        Assertions.assertTrue(status);
    }
}
