package com.jl.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jl.springcloud.entities.Dept;
//与springboot结合
@Mapper
public interface DeptDao {
	public boolean addDept(); 
	public Dept findById(); 
	public Dept findAll(); 
}
