package cn.liuyoulong.web.vo;

import cn.liuyoulong.web.dto.User;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "AddUserRequestVo")
public class AddUserRequestVo {

    @ApiModelProperty(value = "users")
    private List<User> users;
}
