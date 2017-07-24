package com.ram.config.propfile;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

public class SelectBean implements Select{
	
	DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public String fetchName(int eno) {
		try{
			Connection con=ds.getConnection();
			System.out.println("Connection Established");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT name from GAME_TABLE_TYPE WHERE id="+eno );
			String name=null;
			if(rs.next())
			{
				name=rs.getString(1);
			}
			rs.close();
			st.close();
			con.close();
			return name;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub
		return null;
	}

	public int fetchSalary(int eno) {
		// TODO Auto-generated method stub
		return 0;
	}

}
