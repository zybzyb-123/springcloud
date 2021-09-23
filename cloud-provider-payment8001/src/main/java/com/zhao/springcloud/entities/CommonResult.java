package com.zhao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String messages;
    private T data;

    public CommonResult(Integer code,String messages){
        this(code,messages,null);
    }
}
