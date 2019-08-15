package com.my.mapping;

import com.my.pojp.Spudetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SpuDetailMapper{
    @Select("select *from tb_spu_detail where spu_id=#{spu_id}")
    Spudetail getDetailById(Long spu_id);
}
