package com.my.pojp;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data

public class UserInfo implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String phone;
    private Date created;
    private String code;
}
