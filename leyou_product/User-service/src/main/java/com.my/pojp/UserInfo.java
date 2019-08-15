package com.my.pojp;

import io.micrometer.core.instrument.noop.NoopLongTaskTimer;
import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "tb_user")
public class UserInfo implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String phone;
    private Date created;
    private String code;

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
