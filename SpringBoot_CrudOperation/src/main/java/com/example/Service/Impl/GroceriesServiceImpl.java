package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Groceries;
import com.example.Repository.GroceriesRepository;
import com.example.Service.GroceriesService;

@Service
public class GroceriesServiceImpl implements GroceriesService
{
	@Autowired(required=true)
	private GroceriesRepository groceriesRepository;
	
	@Override
	public Groceries createGroceries(Groceries groceries)
	{
		return groceriesRepository.save(groceries);
	}

	@Override
	public List<Groceries> findaAllGroceries()
	{
		return groceriesRepository.findAll();
	}

	@Override
	public void deleteGroceries(int id) {
		
		groceriesRepository.deleteById(id);
	}

	@Override
	public Groceries updateGroceries(Groceries groceries) {
		
		Groceries _groceries=groceriesRepository.findById(groceries.getGId()).get();
		_groceries.setGName(groceries.getGName());
		_groceries.setGPrice(groceries.getGPrice());
		_groceries.setGQuantity(groceries.getGQuantity());
		
		
		
		return groceriesRepository.save(_groceries) ;
		
	}
	
	@Override
	public Groceries findGroceriesById(int id) {
		// TODO Auto-generated method stub
		return groceriesRepository.findById(id).get();
	}
	
	
	@Override
	public List<Groceries> findByGroceriesname(String name) {
		
		return groceriesRepository.findByGName(name);
	}

	
}
