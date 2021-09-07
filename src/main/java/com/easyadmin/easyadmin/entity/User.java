package com.easyadmin.easyadmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.easyadmin.easyadmin.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author mihuan
 * @since 2021-09-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String user;

    /**
     * 密码
     */
    private String password;



}
