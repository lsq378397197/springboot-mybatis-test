package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.UserLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserLogMapper extends BaseMapper<UserLog> {
    /**
     * 查询所有用户
     *
     * @return List<UserEntity>
     */
    List<UserLog> queryAllUserLogs();
    
}
