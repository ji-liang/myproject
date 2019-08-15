package com.my.service;

import com.google.gson.Gson;
import com.my.pojp.Cart;
import com.my.pojp.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    private StringRedisTemplate redisTemplate;
    private Gson gson=new Gson();
    public void addItem(Long id, Cart cart) {
        String skuId=cart.getSkuId()+"";
        Integer num=cart.getNum();
        BoundHashOperations options = redisTemplate.boundHashOps(id+"");
        if(options.hasKey(skuId)){
            cart=gson.fromJson(options.get(skuId).toString(), Cart.class);
            cart.setNum(cart.getNum()+num);

        }
        options.put(skuId,gson.toJson(cart));
        System.out.println("数据库"+cart);
    }

    public List getCarts(Long id) {
        List<Cart> clist=new ArrayList();
        BoundHashOperations options = redisTemplate.boundHashOps(id+"");
        List<String> list=options.values();
        for (String json:list) {
            Cart cart=gson.fromJson(json,Cart.class);
            clist.add(cart);
        }
        return clist;
    }

    public void delete(UserInfo user,String skuId) {
        redisTemplate.opsForHash().delete(user.getId()+"",skuId);
    }

    public void update(UserInfo user, Cart cart) {
        String userId=user.getId()+"";
        BoundHashOperations options = redisTemplate.boundHashOps(userId);
        Cart c=gson.fromJson(options.get(cart.getSkuId()+"").toString(),Cart.class);
        c.setNum(cart.getNum());
        options.put(cart.getSkuId().toString(),gson.toJson(c));
    }
}
