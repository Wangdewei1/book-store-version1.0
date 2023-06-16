package com.itwang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String userPwd;
    private String email;
}
