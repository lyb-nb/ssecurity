package cn.lyb.ch02.common;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author zhengjianc
 * @Date 2019/8/6 23:55
 */
@Data
@Accessors(chain = true)
public class CommonResponse {
    private Boolean success;
    private Integer code;
    private String message;
    private Object data;

    private CommonResponse() {
    }

    public static CommonResponse success() {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setSuccess(true)
                .setCode(200)
                .setMessage("成功");
        return commonResponse;
    }

    public static CommonResponse success(Object data) {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setSuccess(true)
                .setCode(200)
                .setMessage("成功")
                .setData(data);
        return commonResponse;
    }
}
