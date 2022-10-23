package cn.liuyoulong.web.vo;

import cn.liuyoulong.web.dto.User;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "UserVo")
public class UserVo extends User {

    @ApiModelProperty(value = "current")
    private int current;

    @ApiModelProperty(value = "size")
    private int size;
}
