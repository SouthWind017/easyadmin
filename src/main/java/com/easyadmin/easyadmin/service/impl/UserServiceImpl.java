package com.easyadmin.easyadmin.service.impl;

import com.easyadmin.easyadmin.entity.User;
import com.easyadmin.easyadmin.mapper.UserMapper;
import com.easyadmin.easyadmin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mihuan
 * @since 2021-09-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
