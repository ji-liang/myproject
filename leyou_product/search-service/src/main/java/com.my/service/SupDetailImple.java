package com.my.service;

import com.my.mapping.SpuDetailMapper;
import com.my.pojp.Spudetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupDetailImple implements SupDetailService {
    @Autowired
    private SpuDetailMapper spuDetailMapper;

    @Override
    public Spudetail getDetailById(Long sup_id) {
        return spuDetailMapper.getDetailById(sup_id);
    }
}
