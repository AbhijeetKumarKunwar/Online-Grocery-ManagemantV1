package com.rowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.*;
public class RegistrationRowMapper implements RowMapper<Registration> {

	@Override
	public Registration mapRow(ResultSet result, int row) throws SQLException {
		// TODO Auto-generated method stub
		Registration reg=new Registration();
		reg.setUserName(result.getString(1));
		reg.setPassword(result.getString(2));
		reg.setEmail(result.getString(3));
		reg.setNumber(result.getString(4));
		reg.setSex(result.getString(5));
		return reg;
	}

}
