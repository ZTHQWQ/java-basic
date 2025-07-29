

package com.openapi3.entity;
import java.io.Serializable;

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
@TableName("user")
@Schema(name="User", description="")
public class User implements Serializable {
private static final long serialVersionUID=1L;
    @TableId(value = "id", type = IdType.AUTO)
    @Schema(description = "主键", type = "Long")
    private Long id;

    @TableField("name")
    @Schema(description = "用户名", type = "String")
    private String name;

    @TableField("age")
    @Schema(description = "年龄", type = "Integer")
    private Integer age;

}