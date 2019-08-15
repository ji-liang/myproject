package com.my.service;

import com.github.pagehelper.PageInfo;
import com.my.pojp.Spu;

import java.util.List;

public interface SerarchService {
    PageInfo getAllSpu(Spu spu, Integer page, Integer size);
}
