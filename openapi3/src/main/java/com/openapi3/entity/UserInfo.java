

package com.openapi3.entity;
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
import io.swagger.v3.oas.annotations.media.Schema; // 导入swagger3注解
/**
* 
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("user_info")
@Schema(name="UserInfo", description="")
public class UserInfo implements Serializable {
private static final long serialVersionUID=1L;
    @TableId(value = "id", type = IdType.AUTO)
    @Schema(description = "id", type = "Long")
    private Long id;

    @TableField("user_id")
    @Schema(description = "userid", type = "String")
    private String userId;

    @TableField("name")
    @Schema(description = "用户姓名", type = "String")
    private String name;

    @TableField("email")
    @Schema(description = "用户邮箱", type = "String")
    private String email;

    @TableField("phone")
    @Schema(description = "用户手机", type = "String")
    private String phone;

    @TableField("address")
    @Schema(description = "用户住址", type = "String")
    private String address;

    @TableField("created_at")
    @Schema(description = "创建时间", type = "Date")
    private Date createdAt;

    @TableField("updated_at")
    @Schema(description = "更新时间", type = "Date")
    private Date updatedAt;

}