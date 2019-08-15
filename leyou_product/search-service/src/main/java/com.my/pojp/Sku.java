package com.my.pojp;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "tb_sku")
public class Sku implements Serializable {
    private Long id;
    private Long spu_id;
    private String title;
    private String images;
    private Long price;
    private String indexes;
    private String own_spec;
    private Boolean enable;
    private Date create_time;
    private Date last_update_time;
}
