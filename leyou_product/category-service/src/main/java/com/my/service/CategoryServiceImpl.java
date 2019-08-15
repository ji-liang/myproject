package com.my.service;

import com.my.mapping.CategoryMapping;
import com.my.pojp.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapping categoryMapping;

    public List getAllCategory() {
        List<Category> list1 = categoryMapping.getList((long) 0);
        for (Category cate1 : list1) {
            Long parent_id=cate1.getId();
            List<Category> list2 = categoryMapping.getList(parent_id);
            cate1.setSublist(list2);
            for (Category cate2 : list2) {
                Long parent_id1=cate2.getId();
                List  list3 = categoryMapping.getList(parent_id1);
                cate2.setSublist(list3);
            }
        }
        return list1;


    }
}
