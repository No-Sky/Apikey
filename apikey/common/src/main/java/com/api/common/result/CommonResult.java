package com.api.common.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @description:
 * @author: XFW
 * @version:
 * @create: 2019-02-01 17:48
 **/
public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = -8727623256526713604L;

    /**
     * 成功结果码：1
     */
    @ApiModelProperty(value = "成功结果码", required = false)
    public static final Integer SUCCESS_CODE = 1;

    /**
     * 失败结果码：-1
     */
    @ApiModelProperty(value = "失败结果码", required = false)
    public static final Integer FAILURE_CODE = -1;

    /**
     * 空数据结果码：0
     */
    @ApiModelProperty(value = "空数据结果码", required = false)
    public static final Integer NULLDATA_CODE = 0;

    /**
     * 系统异常结果码：-2
     */
    @ApiModelProperty(value = "系统异常结果码", required = false)
    public static final Integer SYSEXP_CODE = -2;



    /**
     * 响应结果码
     */
    @ApiModelProperty(value = "响应结果码", required = true)
    private int code;

    /**
     * 响应结果信息
     */
    @ApiModelProperty(value = "响应结果信息", required = true)
    private String msg;

    /**
     * 响应结果对象
     */
    @ApiModelProperty(value = "响应结果对象", required = true)
    private T entiy;

    /**
     * 服务器系统当前时间
     */
    @ApiModelProperty(value = "服务器系统当前时间", required = true)
    private LocalDateTime systemTime = LocalDateTime.now();

    public CommonResult(){
    }

    public CommonResult(int code, String msg, T entiy) {
        super();
        this.code = code;
        this.msg = msg;
        this.entiy = entiy;
    }

    public CommonResult(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getEntiy() {
        return entiy;
    }

    public void setEntiy(T entiy) {
        this.entiy = entiy;
    }

    public String getSystemTime() {
        return systemTime.toString();
    }

    public void setSystemTime(LocalDateTime systemTime) {
        this.systemTime = systemTime;
    }
}
