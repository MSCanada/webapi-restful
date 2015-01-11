package test123;
import java.lang.Object;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

public class test {
public static	Wines item;
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

			//String url = "http://www.barnivore.com/wine.json";
		//String url = "http://www.barnivore.com/beer.json";
		String url = "http://www.barnivore.com/liquor.json";
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			// add request header

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			String result=response.toString();
			JSONArray arr=new JSONArray(result);
			DBConnect item1=new DBConnect();
			//System.out.println("Length is:"+ arr.length());
			for(int i=0;i<arr.length();i++)
			{
			JSONObject obj1=arr.optJSONObject(i);
			JSONObject obj2=obj1.optJSONObject("company");
			//System.out.println(obj2);
			 item=new Wines();
			String phone=obj2.optString("phone");
			String company_name=obj2.optString("company_name");
			String address=obj2.optString("address");
			String city=obj2.optString("city");
			String state=obj2.optString("state");
			String postal=obj2.optString("postal");
			String country=obj2.optString("country");
			String url1=obj2.optString("url");
			String notes=obj2.optString("notes");
			String status=obj2.optString("status");
			String colour=obj2.optString("red_yellow_green");
item.set_phone(phone);
item.set_company_name(company_name);
item.set_address(address);
item.set_city(city);
item.set_state(state);
item.set_postal(postal);
item.set_country(country);
item.set_url(url1);
item.set_notes(notes);
item.set_status_(status);
item.set_colour(colour);
			
			
			
			
		
			item1.getData(item);
			}
			// print result
		//	System.out.println(response.toString());

		}

	}





