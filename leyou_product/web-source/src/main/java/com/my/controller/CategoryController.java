package com.my.controller;


import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.my.pojp.Cart;
import com.my.pojp.Spudetail;


import com.my.pojp.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


@Controller
//@DefaultProperties(defaultFallback = "defaultFallback") //指定所有方法的默认回调方法
public class CategoryController {
//    @Autowired
//    private CategoryFeignClient feignClient;

    @Autowired
    private RestTemplate restTemplate;
    //测试Feign调用
    @RequestMapping("/cate")
    public String queryAll(ModelMap model) {
        String url="http://category-service/category/list";
        List<Map>list= restTemplate.getForObject(url,List.class);
        model.put("list",list);
        return "index";
    }
    @RequestMapping("/search")
    public String querySpu(ModelMap model, Integer id, @RequestParam(value = "page",defaultValue="1") Integer page,@RequestParam(value = "size",defaultValue="10") Integer size) {
        String url="http://search-service/search/list?id="+id+"&page="+page+"&size="+size;
        PageInfo pageInfo= restTemplate.getForObject(url,PageInfo.class);
         model.put("pageInfo",pageInfo);
        model.put("sid",id);
        return "search";
    }
    @RequestMapping("/detail")
    public String queryAll(ModelMap model, Long spu_id, String title, Long price, Long id,String images) {
        String url="http://search-service/search/detail?spu_id="+spu_id;
        Spudetail spudetail=restTemplate.getForObject(url,Spudetail.class);
        model.put("title",title);
        model.put("id",id);
        model.put("price",price);
        model.put("images",images);
        model.put("spudetail",spudetail);
        return "item";
    }
    @RequestMapping("/success")
    public String successCart(ModelMap model,HttpSession session, Cart cart) {

        Gson gson = new Gson();
        String str=gson.toJson(cart);
        Long id=((UserInfo)session.getAttribute("user")).getId();
        String url="http://search-service/cart/add?cart="+str+"&id="+id;
        restTemplate.getForObject(url,String.class,str);
        return "redirect:/cartlist";
    }
    @RequestMapping("/cartlist")
    public String allCart(ModelMap model, Cart cart,HttpSession session) {
        Gson gson = new Gson();
        String str=gson.toJson(cart);
        Long id=((UserInfo)session.getAttribute("user")).getId();
        String url="http://search-service/cart/list?id="+id;
       List<Map>cartlist=restTemplate.getForObject(url,List.class);
        model.put("cartlist",cartlist);
        return "cart";
    }

    @RequestMapping("/login")
    public String checkLogin(HttpSession session,String username,String password){
        String url="http://user-service/user/check?username="+username+"&password="+password;
        UserInfo user=restTemplate.getForObject(url,UserInfo.class);
        if ( user!=null){
            session.setAttribute("user",user);
            return "redirect:/cate";
        }
       return "login";
    }

}
