package com.data.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	int pid;
	
	@Column(name="name")
	String pname;
	@Column(name="price")
	Double price;
	
	@ManyToOne
	@JoinColumn(name="cid")    
    
       @JsonBackReference
	Category category;             
					
	public Product() {
	}


	public Product(String pname, Double price) {
		
		this.pname = pname;
		this.price = price;
	}
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}