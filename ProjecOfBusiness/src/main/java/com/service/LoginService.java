package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.Registration;
import com.rowMapper.RegistrationRowMapper;

@Service
public class LoginService {
	@Autowired
	JdbcTemplate jdbctemp;
	
	public int addData(Registration reg)
	{
		int row=0;
		String userName=reg.getUserName();
		String password=reg.getPassword();
		String email=reg.getEmail();
		String contact=reg.getNumber();
		String sex=reg.getSex();
		String str = "insert into registration values(?,?,?,?,?)";
		try
		{
			
	 row=jdbctemp.update(str,userName,password,email,contact,sex);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		return row;
					
	}
	public Registration getDetails(String email)
	{
		RegistrationRowMapper r=new RegistrationRowMapper();
		String qry="select * from registration where email=?";
		Registration reg=null;
		try
		{
			 reg=jdbctemp.queryForObject(qry, r,email);//row mapper implemented method will call autometically
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return reg;
	}
//	public List<Object> retriveData()
//	{
//		List<Object> list=new ArrayList<>();
//		String email="sdg";
//		String str = "select * from registration"; This is for retriving the data in one array , whole data in one array list
//	List<Map<String,Object>> reg=jdbctemp.queryForList(str);
//	for(Map<String,Object> map:reg)
//	{
//		for(Object obj:map.keySet())
//		list.add(map.get(obj));
//	}
//	System.out.println(list);
//		return list;
//	}
}
