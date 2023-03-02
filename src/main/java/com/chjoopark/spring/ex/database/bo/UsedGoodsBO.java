package com.chjoopark.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chjoopark.spring.ex.database.dao.UsedGoodsDAO;
import com.chjoopark.spring.ex.database.model.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	// used_goodsd 테이블을 전체 데이터 조회기능 
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsDAO.selectUsedGoodsList();
		
		return usedGoodsList;
	}
	
	

}
