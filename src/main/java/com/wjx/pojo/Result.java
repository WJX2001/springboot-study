package com.wjx.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
  private Integer code; // 响应码：1、代表成功 2、代表失败
  private String msg; // 响应信息 描述字符串
  private Object data; // 返回的数据
  private Boolean success;

  public static Result success() { // 增删改 成功响应
    return new Result(1,"success",null,true);
  }
  public static Result success(Object data) { // 增删改 成功响应
    return new Result(1,"success",data,true);
  }

  public static Result error(String msg) { // 失败响应
    return new Result(0,msg,null,false);
  }
}
