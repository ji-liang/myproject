package com.my.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.mapping.SpuMapping;
import com.my.pojp.Spu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SerarchServiceImpl implements SerarchService {
   @Autowired
   private SpuMapping spuMapping;
    public PageInfo getAllSpu(Spu spu, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Spu> list = spuMapping.getAllSup(spu);
        PageInfo<Spu> pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
