package com.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.Entity.Category;

@Repository
public interface CategoryRepository  extends  JpaRepository<Category,Integer>{
	

     
	

}