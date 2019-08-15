package com.my.dao;




import java.util.List;

import com.dao.BaseDao;
import com.my.entity.Item;


public class ItemDao extends BaseDao {
	public int addAnswer(int answer_id,List items,int select){
		String sql="INSERT INTO item_info VALUES ";
		for (int i = 0; i < items.size(); i++) {
			if(i!=0){
				sql+=",(0,'"+answer_id+"','"+items.get(i)+"','"+select+"')";
			}else{
				sql+="(0,'"+answer_id+"','"+items.get(i)+"','"+select+"')";
			}	
		}
		return super.update(sql);
	}
	public int delItem(int id){
		String sql="DELETE FROM item_info WHERE answer_id="+id;
		return super.update(sql);
	}
	public List<Item>getItem(int id){
		String sql="SELECT * FROM item_info WHERE answer_id="+id;
		return super.query(sql, Item.class);
	}
}
