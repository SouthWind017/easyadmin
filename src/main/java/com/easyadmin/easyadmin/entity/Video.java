package com.easyadmin.easyadmin.entity;

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
public class Video extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 视频连接
     */
    private String url;

    /**
     * 视频封面URL
     */
    private String img;

    /**
     * 视频分类
     */
    private String item;

    /**
     * 视频描述
     */
    private String desc;


}
