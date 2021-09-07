package com.easyadmin.easyadmin.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
public class BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 键值
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 状态
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer state;

    /**
     * 删除
     */
    @TableLogic
    private Integer del;

    /**
     * 创建时间
     */
    private Integer creteTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private Integer updateTime;
}
