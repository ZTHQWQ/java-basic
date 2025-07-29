package com.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String userId;

    private String name;

    private String email;

    private String phone;

    private String address;

    private Date createdAt;

    private Date updatedAt;
}