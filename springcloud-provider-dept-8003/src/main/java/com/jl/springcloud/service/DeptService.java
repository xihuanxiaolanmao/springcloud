package com.jl.springcloud.service;

import java.util.List;

import com.jl.springcloud.entities.Dept;

public interface DeptService {
	public boolean addDept(Dept dept); 
	public Dept findById(Long id); 
	public List<Dept> findAll(); 
}
