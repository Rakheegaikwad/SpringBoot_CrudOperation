package com.example.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Groceries;
import com.example.Service.GroceriesService;

@RestController
public class GroceriesController
{
	@Autowired(required=true)
	GroceriesService groceriesService;
	
	//performing crud Operation 
	
	@PostMapping(value="/groceries")
	public Groceries createGroceries(@RequestBody Groceries groceries)
	{
		return groceriesService.createGroceries(groceries);
	}

	@GetMapping(value="/groceries")
	public List<Groceries> findAllGroceries()
	{
		return groceriesService.findaAllGroceries();
		
	}
	
	@GetMapping(value="/groceries/{id}")
	public Groceries findGroceriesById(@PathVariable int id)
	{
		return groceriesService.findGroceriesById(id);
	}
	@GetMapping(value="/groceries/Name/{name}")
	public List<Groceries> findByGroceriesname(@PathVariable String name)
	{
		return groceriesService.findByGroceriesname(name);
	}
	
	
	
	@DeleteMapping(value="/groceries/{id}")
	public void deleteGroceries(@PathVariable int id)
	{
		 groceriesService.deleteGroceries(id);
	}
	
	@PutMapping(value="/groceries")
	public Groceries updateGroceries(@RequestBody Groceries groceries)
	{
		return groceriesService.updateGroceries(groceries);
	}
	
	
}
