package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Groceries;

@Repository
public interface GroceriesRepository extends JpaRepository<Groceries,Integer> {

	public List<Groceries> findByGName(String gname);
	
}
