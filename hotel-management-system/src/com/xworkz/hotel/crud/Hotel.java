package com.xworkz.hotel.crud;

import com.xworkz.hotel.dto.FoodDTO;

public interface Hotel {


    boolean createFoodItem(FoodDTO foodItem);
	 void getFoodItemDetails();
	 boolean updatePriceByName(String name, int price);
	 boolean deleteByName(String name);
	 boolean deleteByType(String type);
	 String[] getAllFoodItemName();

}
