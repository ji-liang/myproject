package com.my.controller;

import com.github.pagehelper.PageInfo;
import com.my.pojp.Spu;
import com.my.pojp.Spudetail;
import com.my.service.SerarchService;
import com.my.service.SupDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SerarchController {
    @Autowired
    private SerarchService serarchService;
    @Autowired
    private SupDetailService supDetailService;
    @RequestMapping(value = "/list",produces = "application/json")
    public PageInfo getSearch(Integer id, @RequestParam(value = "page") Integer page, @RequestParam(value = "size") Integer size){
        return  serarchService.getAllSpu(new Spu(Long.valueOf(id)),page,size);
    }
    @RequestMapping(value = "/detail")
    public Spudetail getDetail(Long spu_id){
        return supDetailService.getDetailById(spu_id);
    }
}
