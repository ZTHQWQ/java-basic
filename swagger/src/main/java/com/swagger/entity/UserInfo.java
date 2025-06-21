

package com.swagger.entity;
import java.io.Serializable;

import java.util.Date;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;  // 导入 TableId 注解
import com.baomidou.mybatisplus.annotation.IdType;  // 导入 IdType 枚举
import com.baomidou.mybatisplus.annotation.TableField;  // 导入 TableField 注解
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty; // 导入swagger注解
/**
* 
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("user_info")
@ApiModel(value="UserInfo对象", description="")
public class UserInfo implements Serializable {
private static final long serialVersionUID=1L;
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "id",  dataType = "java.lang.Long")
    private Long id;

    @TableField("user_id")
    @ApiModelProperty(value = "userid",  dataType = "java.lang.String")
    private String userId;

    @TableField("name")
    @ApiModelProperty(value = "用户姓名",  dataType = "java.lang.String")
    private String name;

    @TableField("email")
    @ApiModelProperty(value = "用户邮箱",  dataType = "java.lang.String")
    private String email;

    @TableField("phone")
    @ApiModelProperty(value = "用户手机",  dataType = "java.lang.String")
    private String phone;

    @TableField("address")
    @ApiModelProperty(value = "用户住址",  dataType = "java.lang.String")
    private String address;

    @TableField("created_at")
    @ApiModelProperty(value = "创建时间",  dataType = "java.util.Date")
    private Date createdAt;

    @TableField("updated_at")
    @ApiModelProperty(value = "更新时间",  dataType = "java.util.Date")
    private Date updatedAt;

}