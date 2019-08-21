package com.jl.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jl.springcloud.dao.DeptDao;
import com.jl.springcloud.entities.Dept;
import com.jl.springcloud.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptDao deptDao;
	@Override
	public boolean addDept(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		return deptDao.findAll();
	}

}
