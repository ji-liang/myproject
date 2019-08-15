package com.my.pojp;

import lombok.Data;

import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "tb_category")
public class Category implements Serializable {
    private Long id;
    private String name;
    private Long parent_id;
    private Boolean is_parent;
    private Integer sort;
    @Transient
    private List<Category>sublist;
}
