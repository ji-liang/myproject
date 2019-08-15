package com.my.pojp;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data

public class Category implements Serializable {
    private Long id;
    private String name;
    private Long parent_id;
    private Boolean is_parent;
    private Integer sort;
    private List<Category>sublist;
}
