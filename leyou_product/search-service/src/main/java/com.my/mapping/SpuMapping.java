package com.my.mapping;

import com.my.pojp.Spu;
import org.apache.ibatis.annotations.*;

import java.util.List;



@Mapper
public interface SpuMapping  {
    @Select("select * from tb_spu p where  p.cid3=#{cid3} ")
    @Results({@Result(id=true, property="id",column="id"),
            @Result(property="title",column="title"),
            @Result(property="sub_title",column="sub_title"),
            @Result(property="cid1",column="cid1"),
            @Result(property="cid2",column="cid2"),
            @Result(property="cid3",column="cid3"),
            @Result(property="brand_id",column="brand_id"),
            @Result(property="saleable",column="saleable"),
            @Result(property="cid3",column="cid3"),
            @Result(property="brand_id",column="brand_id"),
            @Result(property="valid",column="valid"),
            @Result(property="create_time",column="create_time"),
            @Result(property="last_update_time",column="last_update_time"),
            @Result(property="list",column="id",many=@Many(select="com.my.mapping.SkuMapping.getSku"))})
    List<Spu>getAllSup(Spu spu);
}
