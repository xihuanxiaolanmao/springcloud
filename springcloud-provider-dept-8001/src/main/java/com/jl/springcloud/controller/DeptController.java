package com.jl.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jl.springcloud.entities.Dept;
import com.jl.springcloud.service.DeptService;

@RestController
@RequestMapping("dept")
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@PostMapping("/add")
	public boolean addDept(@RequestBody Dept dept) {
		return deptService.addDept(dept);
	}
	@GetMapping("/findById/{id}")
	public Dept findById(@PathVariable("id") Long id) {
		return deptService.findById(id);
	}
	@GetMapping("/findAll")
	public List<Dept> findAll() {
		return deptService.findAll();
	}
}
