package com.my.pojp;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data

public class Spu implements Serializable {
    private Long id;
    private String title;
    private String sub_title;
    private Long cid1;
    private Long cid2;
    private Long cid3;
    private Long brand_id;
    private Boolean saleable;
    private Boolean valid;
    private Date create_time;
    private Date last_update_time;
    private List<Sku>list;

    public Spu(Long cid1, Long cid2, Long cid3) {
        this.cid1 = cid1;
        this.cid2 = cid2;
        this.cid3 = cid3;
    }

}
