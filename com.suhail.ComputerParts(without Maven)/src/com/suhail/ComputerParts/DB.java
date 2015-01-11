package com.suhail.ComputerParts;

import java.sql.*;
import java.util.ArrayList;

public class DB {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	int row_count = 0;
	String query;
	ArrayList<Wines> result;

	public DB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://MYSQL5005.myWindowsHosting.com:3306/db_9b8d99_msuhail","9b8d99_msuhail","cricket_123");			

			st = con.createStatement();
		} catch (Exception ex) {
			System.out.println("Error:" + ex);
		}

	}

	public ArrayList<Wines> getdata(String country) {
		result = new ArrayList<Wines>();
		Wines item1 = new Wines();
		try {
			
			if(country==null)
			 query = "Select * from wines";
			else 
				 query = "Select * from wines where country='"+country+"'";
			
			rs = st.executeQuery(query);
			while (rs.isAfterLast() == false) {
				row_count = row_count + 1;
				rs.next();

			}
			row_count = row_count - 1;
			rs.first();
			for (int i = 0; i < row_count; i++) {
				item1 = new Wines();
				item1.set_company_name(rs.getString("company_name"));
				item1.set_address(rs.getString("address"));
				item1.set_city(rs.getString("city"));
				item1.set_state(rs.getString("state"));
				item1.set_postal(rs.getString("postal"));
				item1.set_country(rs.getString("country"));
				item1.set_phone(rs.getString("phone"));
				item1.set_url(rs.getString("url"));
				item1.set_notes(rs.getString("notes"));
				item1.set_status_(rs.getString("status_"));
				item1.set_colour(rs.getString("colour"));
				result.add(item1);
				rs.next();
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}

		System.out.println("count=" + row_count);
		return result;

	}

}
