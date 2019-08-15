package com.my.mapping;

import com.my.pojp.Category;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface CategoryMapping extends Mapper<Category> {
    @Select("select * from tb_category c where c.parent_id=#{id}")
    List<Category>getList(Long id);
}
