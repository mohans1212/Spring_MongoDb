package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Monthly_Ex;
import com.example.demo.repo.MonthRepo;


@RestController
public class Controller {
	
	@Autowired
	public MonthRepo repo;
	
	@GetMapping(value="/get")
	public List<Monthly_Ex> getAllExp()
	{
		return repo.findAll();
	}
	
	@PostMapping(value="/post")
	public String createExp(@RequestBody Monthly_Ex monthly_ex)
	{
		repo.insert(monthly_ex);
		return "created";
	}
	
	/*@PostMapping(value = "/post")
	public String addProductDetails(@RequestBody Monthly_Ex month) {
		System.out.println("=====connected controller======");
		long id = repo.addMothly_Ex(month);
		return "One Product Inserted and it Id --> ::"+id; 
	}*/
	
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteProductById(@PathVariable long id) {
		
		 repo.deleteById(id);
		 
		 
		System.out.println("=====Deleted Product Id======"+id);
		
	}

}
