package com.xworkz.hotel;

import java.util.Scanner;

import com.xworkz.hotel.dto.FoodDTO;

public class HotelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Food id");
    int id = sc.nextInt();
    System.out.println("Enter the Food Name");
    String name = sc.next();
    System.out.println("Enter the Food  type");
    String type = sc.next();
    System.out.println("Enter the Food price");
    int price = sc.nextInt();
    
    FoodDTO food = new FoodDTO();
    food.setId(id);
    food.setName(name);
    food.setType(type);
    food.setPrice(price);
    
    System.out.println(food);
    
    sc.close();
    
	}

}
