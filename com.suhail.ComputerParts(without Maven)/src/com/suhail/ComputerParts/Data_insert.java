package com.suhail.ComputerParts;

import java.sql.*;
import java.util.ArrayList;

public class Data_insert {
	private Connection con;
	private PreparedStatement st;
	private ResultSet rs;

	public Data_insert() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String que = "insert into liquor(company_name,address,city,state,postal,country,phone,url,notes,status_,colour) values(?,?,?,?,?,?,?,?,?,?,?)";

			con = DriverManager
					.getConnection(
							"jdbc:mysql://MYSQL5005.myWindowsHosting.com:3306/db_9b8d99_msuhail",
							"9b8d99_msuhail", "cricket_123");

			// con = DriverManager.getConnection(
			// "jdbc:mysql://localhost:3306/wines", "root", "cricket");
			st = con.prepareStatement(que);
		} catch (Exception ex) {
			System.out.println("Error:" + ex);

		}
	}

	public void getData(Wines item) {
		try {

			st.setString(1, item.get_company_name());
			st.setString(2, item.get_address());
			st.setString(3, item.get_city());
			st.setString(4, item.get_state());
			st.setString(5, item.get_postal());
			st.setString(6, item.get_country());
			st.setString(7, item.get_phone());
			st.setString(8, item.get_url());
			st.setString(9, item.get_notes());
			st.setString(10, item.get_status_());
			st.setString(11, item.get_colour());

			st.execute();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
