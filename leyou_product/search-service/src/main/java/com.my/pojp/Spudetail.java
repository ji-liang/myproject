package com.my.pojp;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "tb_spu_detail")
public class Spudetail {
    private Long spu_id;
    private String description;
    private String specifications;
    private String spec_template;
    private String packing_list;
    private String after_service;
}
