package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户操作日志
 *
 * @author liushangqing
 * @date 2022/1/16 17:29
 */
@Data
@TableName("t_user_log")
public class UserLog {
    private Integer id;
    private Integer userId;
    private Date loginDate;
}

