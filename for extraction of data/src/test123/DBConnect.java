package test123;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;



public class DBConnect {
	private Connection con;
	private PreparedStatement st;
	private ResultSet rs;
	public DBConnect(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//String que="insert into wines(company_name,address,city,state,postal,country,phone,url,notes,status_,colour) values(?,?,?,?,?,?,?,?,?,?,?)";
			//String que="insert into beer(company_name,address,city,state,postal,country,phone,url,notes,status_,colour) values(?,?,?,?,?,?,?,?,?,?,?)";
			String que="insert into liquor(company_name,address,city,state,postal,country,phone,url,notes,status_,colour) values(?,?,?,?,?,?,?,?,?,?,?)";

			
			con=DriverManager.getConnection("jdbc:mysql://MYSQL5005.myWindowsHosting.com:3306/db_9b8d99_msuhail","9b8d99_msuhail","password");			st=con.prepareStatement(que);
			
		}
		catch(Exception ex){
			System.out.println("Error:"+ex);
			
		}
	}
	
	
	public void getData(Wines item){
		try{
	
		
	
	//	st.addBatch("create table junoon(junoon1 int, junoon2 int);");
	//String que="insert into wines(company_name,address,city,state,postal,country,phone,url,notes,status_,colour) values('"+item.get_company_name()+"'"+",'"+item.get_address()+"','"+item.get_city()+"','"+item.get_state()+"','"+item.get_postal()+"','"+item.get_country()+"','"+item.get_phone()+"','"+item.get_url()+"',\""+item.get_notes()+"\",'"+item.get_status_()+"','"+item.get_colour()+"')";
	//String que="insert into wines(company_name,address,city,state,postal,country,phone,url,notes,status_,colour) values(?,?,?,?,?,?,?,?,?,?,?)";

			//System.out.println(que);
	
	st.setString( 1, item.get_company_name());
	st.setString( 2, item.get_address());
	st.setString( 3, item.get_city());
	st.setString( 4, item.get_state());
	st.setString( 5, item.get_postal());
	st.setString( 6, item.get_country());
	st.setString( 7, item.get_phone());
	st.setString( 8, item.get_url());
	st.setString( 9, item.get_notes());
	st.setString( 10, item.get_status_());
	st.setString( 11, item.get_colour());
	
	
//st.addBatch("update junoon set junoon1='5',junoon2='8'");
st.execute();	




	

	
		
		}
	catch(Exception ex){
		System.out.println(ex);
	}
		
			}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


