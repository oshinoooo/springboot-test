package cn.liuyoulong.web.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response<T> {

    private int code;

    private String msg;

    private T data;

    public static Response ok() {
        return new Response(200, "ok", null);
    }

    public static Response error(String errorMessage) {
        return new Response(500, errorMessage, null);
    }

    public static <T> Response ok(T data) {
        return new Response(200, "ok", data);
    }
}
