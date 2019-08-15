package com.my.controller;


import com.google.gson.Gson;
import com.my.pojp.Cart;
import com.my.pojp.UserInfo;
import com.my.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    @RequestMapping("/add")
    public String add(Long id, String cart){
        Gson gson=new Gson();
        cartService.addItem(id,gson.fromJson(cart,Cart.class));
        return "";
    }
    @RequestMapping("/list")
    public List<Cart>list(long id){
        List<Cart> list=cartService.getCarts(id);
        for (Cart c:list) {
            System.out.println(c.getTitle());
        }
        return list;
    }
    @RequestMapping("/del")
    public void delete(UserInfo user){
//        User user=new User(111L);
        String skuId="1";
        cartService.delete(user,skuId);
    }
    @RequestMapping("/update")
    public void update(UserInfo user,Cart cart){
//        User user=new User(111L);
//        Cart cart=new Cart(2L,45);
        cartService.update(user,cart);
    }
}
