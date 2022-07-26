package com.xworkz.hotel.dto;

public class FoodDTO {
   
	private int id;
	 private String name;
	 private int price;
	 private String type;
	 
	 public  FoodDTO(){
	   
	 }
	 
	 public int getId() {
	    return id;
	 }
	 public void setId(int id){
	    this.id = id;
	 }
	 
	 public String getName(){
	    return name;
	 }
	 public void setName(String name){
	    this.name = name;
	 }
	 public int getPrice(){
	    return price;
	 }
	 public void setPrice(int price){
	    this.price = price;
	 }
	 public String getType(){
	    return type;
	 } 
	 public void setType(String type){
	    this.type = type;
	 }
	 
	 @Override
	 public String toString(){
		 return "[OrderDTO : Id = "+this.getId()+", Name = "+this.getName()+", Price = "+this.getPrice()+", Type="+this.getType()+"]";
	 }
	


}
