package com.suhail.ComputerParts;

import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("/V1")
public class test {
	public static final String version = "1.00";
	ArrayList<Wines> result;

	class Item {
		public String name;
		public String class_;
		public String status;

		public Item() {

		}

	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String output(@QueryParam("input") String input) {

		return input;
	}

	@GET
	@Path("/version")
	@Produces(MediaType.TEXT_PLAIN)
	public String func() {
		return version;
	}

	@GET
	@Path("/wines/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response database() {
		DB obj = new DB();
		result = new ArrayList<Wines>();
		Response rb = null;

		ObjectMapper converter = new ObjectMapper();

		result = obj.getdata(null);
		String result1 = null;
		try {
			result1 = converter.writeValueAsString(result);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rb = Response.ok(result1).build();
		return rb;
	}

	@GET
	@Path("wines/json/{country}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response search(@PathParam("country") String country) {
		DB obj = new DB();
		result = new ArrayList<Wines>();
		Response rb = null;

		ObjectMapper converter = new ObjectMapper();

		result = obj.getdata(country);
		String result1 = null;
		try {
			result1 = converter.writeValueAsString(result);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		rb = Response.ok(result1).build();
		return rb;
	}

	@GET
	@Path("wines/xml")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Wines> xml() {
		DB obj = new DB();
		result = new ArrayList<Wines>();

		result = obj.getdata(null);

		return result;

	}

	@GET
	@Path("wines/xml/{country}")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Wines> xml_wine(@PathParam("country") String country) {
		DB obj = new DB();
		result = new ArrayList<Wines>();

		result = obj.getdata(country);

		return result;

	}

	@GET
	@Path("beer/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response beer() {
		DB_beer obj = new DB_beer();
		result = new ArrayList<Wines>();
		Response rb = null;

		ObjectMapper converter = new ObjectMapper();

		result = obj.getdata(null);
		String result1 = null;
		try {
			result1 = converter.writeValueAsString(result);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rb = Response.ok(result1).build();
		return rb;
	}

	@GET
	@Path("beer/json/{country}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response beer(@PathParam("country") String country) {
		DB_beer obj = new DB_beer();
		result = new ArrayList<Wines>();
		Response rb = null;

		ObjectMapper converter = new ObjectMapper();

		result = obj.getdata(country);
		String result1 = null;
		try {
			result1 = converter.writeValueAsString(result);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rb = Response.ok(result1).build();
		return rb;
	}

	@GET
	@Path("beer/xml")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Wines> beer_xml() {
		DB_beer obj = new DB_beer();
		result = new ArrayList<Wines>();
		result = obj.getdata(null);

		return result;

	}

	@GET
	@Path("beer/xml/{country}")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Wines> beer_xml_return(@PathParam("country") String country) {
		DB_beer obj = new DB_beer();
		result = new ArrayList<Wines>();
		result = obj.getdata(country);

		return result;

	}

	@GET
	@Path("liquor/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response liquor() {
		DB_liquor obj = new DB_liquor();
		result = new ArrayList<Wines>();
		Response rb = null;

		ObjectMapper converter = new ObjectMapper();

		result = obj.getdata(null);
		String result1 = null;
		try {
			result1 = converter.writeValueAsString(result);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rb = Response.ok(result1).build();
		return rb;
	}

	@GET
	@Path("liquor/xml")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Wines> liquor_xml() {
		DB_liquor obj = new DB_liquor();
		result = new ArrayList<Wines>();
		result = obj.getdata(null);

		return result;

	}

	@GET
	@Path("liquor/json/{country}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response liquor(@PathParam("country") String country) {
		DB_liquor obj = new DB_liquor();
		result = new ArrayList<Wines>();
		Response rb = null;

		ObjectMapper converter = new ObjectMapper();

		result = obj.getdata(country);
		String result1 = null;
		try {
			result1 = converter.writeValueAsString(result);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rb = Response.ok(result1).build();
		return rb;
	}

	@GET
	@Path("liquor/xml/{country}")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Wines> liquor_xml(@PathParam("country") String country) {
		DB_liquor obj = new DB_liquor();
		result = new ArrayList<Wines>();
		result = obj.getdata(country);
		System.out.println(country);
		return result;
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON,
			MediaType.APPLICATION_FORM_URLENCODED })
	@Produces(MediaType.TEXT_PLAIN)
	public String sending(@FormParam("name") String ref,
			@QueryParam("name") String ref1) {
		JSONObject obj = null;
		if (ref1 == null) {
			try {
				obj = new JSONObject(ref);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Form param is" + ref);
		}
		if (ref == null) {
			try {
				obj = new JSONObject(ref1);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Query param is" + ref1);
		}
		Wines item = new Wines();
		item.set_company_name(obj.optString("company_name"));
		item.set_address(obj.optString("address"));
		item.set_status_(obj.optString("status"));
		item.set_colour(obj.optString("colour"));
		item.set_city(obj.optString("city"));
		item.set_country(obj.optString("country"));
		item.set_notes(obj.optString("notes"));
		item.set_phone(obj.optString("phone"));
		item.set_state(obj.optString("state"));
		item.set_url(obj.optString("url"));
		item.set_postal(obj.optString("postal"));

		Data_insert insert1 = new Data_insert();
		insert1.getData(item);

		return "Record Added";

	}

}
