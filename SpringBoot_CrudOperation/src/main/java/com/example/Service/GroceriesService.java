package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Groceries;

@Service
public interface GroceriesService
{
	public Groceries createGroceries(Groceries groceries);
	public List<Groceries> findaAllGroceries();
	public void deleteGroceries(int id);
	public Groceries updateGroceries(Groceries groceries);
	public Groceries findGroceriesById(int id);
	public List<Groceries> findByGroceriesname(String name);
	
}
