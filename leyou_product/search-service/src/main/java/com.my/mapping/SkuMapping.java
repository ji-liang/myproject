package com.my.mapping;

import com.my.pojp.Sku;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SkuMapping {
    @Select("select * from tb_sku where spu_id=#{id}")
     List<Sku>getSku(Long id);
}
