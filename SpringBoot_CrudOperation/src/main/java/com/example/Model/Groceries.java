/*
 @AuthorName :- Rakhee Gaikwad
 @Date :-12 January 2023
 Program :- Create table of Groceries(ld, name, price, Quantity) and perform CRUD operation using Springboot.
  Add Groceries, delete Groceries, findall Groceries, findbyid and findbyname groceries, update groceries
 
 */

package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Annotation
@Table(name="Groceriess")
//declaring class Groceries
public class Groceries
{
	@Id 	//primary key Annotation
	@GeneratedValue(strategy=GenerationType.AUTO) //id Auto generated Annotation
	//instance variable
	private int GId;
	private String GName;
	private int GPrice;
	private  int GQuantity;
	

	//No Argument Constructor
	
	public Groceries() 
	{
	
	}

	//All Argument Constructor
	public Groceries(int gId, String gName, int gPrice, int gQuantity) {
		super();
		GId = gId;
		GName = gName;
		GPrice = gPrice;
		GQuantity = gQuantity;
	}

	//GETTER AND SETTER
	public int getGId() {
		return GId;
	}

	public void setGId(int gId) {
		GId = gId;
	}

	public String getGName() {
		return GName;
	}

	public void setGName(String gName) {
		GName = gName;
	}

	public int getGPrice() {
		return GPrice;
	}

	public void setGPrice(int gPrice) {
		GPrice = gPrice;
	}

	public int getGQuantity() {
		return GQuantity;
	}

	public void setGQuantity(int gQuantity) {
		GQuantity = gQuantity;
	}
	
	
	
	
}
//end of A Class Groceries