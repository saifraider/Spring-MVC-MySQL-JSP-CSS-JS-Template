package com.saif.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Dao {
	@Autowired JdbcTemplate jdbcTemplate;
	public int add(int x,int y){
		String SQL = "select count(*) from employee";
		System.out.println("Entries in Employee Table = "+ jdbcTemplate.queryForInt(SQL));
		return x+y;
	}
}
