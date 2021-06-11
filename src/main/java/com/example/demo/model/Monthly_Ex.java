package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "monthly_ex")
public class Monthly_Ex {
	
	@Id
	private long id;
	private String category_;
	private int	cost;
	private String priority;
	
	
	
			public Monthly_Ex() {
				super();
			}


			public Monthly_Ex(String category_, int cost, String priority) {
				super();
				this.category_ = category_;
				this.cost = cost;
				this.priority = priority;
			}


			public long getId() {
				return id;
			}


			public void setId(long id) {
				this.id = id;
			}


			public String getCategory() {
				return category_;
			}


			public void setCategory(String category) {
				this.category_ = category;
			}


			public int getCost() {
				return cost;
			}


			public void setCost(int cost) {
				this.cost = cost;
			}


			public String getPriority() {
				return priority;
			}


			public void setPriority(String priority) {
				this.priority = priority;
			}
			
			
	

}
