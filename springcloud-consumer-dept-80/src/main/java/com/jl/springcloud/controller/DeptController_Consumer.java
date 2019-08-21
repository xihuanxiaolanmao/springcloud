package com.jl.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jl.springcloud.entities.Dept;

@RestController
@RequestMapping("deptConsumer")
public class DeptController_Consumer {
	//private static String REST_URL = "http://localhost:8001";
	
	/**
     * 注册再EurekaServer中的微服务名称
     */
    private static final String REST_URL="http://SPRINGCLOUD-DEPT";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL + "/dept/add", dept, Boolean.class);
	}

	@RequestMapping("/dept/findById/{id}")
	public Dept findById(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL + "/dept/findById/" + id, Dept.class);
	}

	@RequestMapping("/dept/findAll")
	public List<Dept> findAll() {
		return restTemplate.getForObject(REST_URL + "/dept/findAll", List.class);
	}

	@RequestMapping(value = "/dept/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL + "/dept/discovery", Object.class);
	}
}
