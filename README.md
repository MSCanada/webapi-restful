This webservice is designed using JAX-RS with Jersey implementation. USers are provided record of top ranked beer,wine liquor stores from all over the world. The record is obtained from 3rd party and and stored in database. THe web api makes use of this database and provide records to users upon request. Available formats are JSON,XML. User can also obtain filtered results of each country.A user can also add its own record into liquor data. Details are highlighted below.
Request made at following urls:
for JSON format: https://msuhailwebapi.herokuapp.com/api/V1/beer/json
				 https://msuhailwebapi.herokuapp.com/api/V1/wines/json
				 https://msuhailwebapi.herokuapp.com/api/V1/liquor/json

for XML format: https://msuhailwebapi.herokuapp.com/api/V1/beer/xml
				 https://msuhailwebapi.herokuapp.com/api/V1/wines/xml
				 https://msuhailwebapi.herokuapp.com/api/V1/liquor/xml
To be able to filter your data out according to your countries you can enter country name as a 'path parameter' after /json or /xml

for JSON format: https://msuhailwebapi.herokuapp.com/api/V1/beer/json/USA
				 https://msuhailwebapi.herokuapp.com/api/V1/wines/json/Canada
				 https://msuhailwebapi.herokuapp.com/api/V1/liquor/json/Australia

for XML format: https://msuhailwebapi.herokuapp.com/api/V1/beer/xml/Canada
				 https://msuhailwebapi.herokuapp.com/api/V1/wines/xml/USA
				 https://msuhailwebapi.herokuapp.com/api/V1/liquor/xml/Austria

To insert data into liquor records you have to make a 'POST' request at followinng url "https://msuhailwebapi.herokuapp.com/api/V1". The API accepts data through POST method in JSON String(JSON text) format. The JSON object contains following keys company_name,address,city,state,postal,country,phone,url,notes,status,colour. This object should be in string form with key "name".

The api accepts JSON string either through Query Parameter or through Form parameter.
For example of Query Parameter: "https://msuhailwebapi.herokuapp.com/api/V1?name="+(your JSON String).

NOTE: Two things are important: JSON string should have key of 'name'. Secondly server would accept request from any domain but because of CORS your browser would display a cross origin share error but server is enabled to handle cross origin request.
For futher reading refer to source code at my GIT HUB profile as it also contains POST.HTML to post data to webapi.

Skills: Restful WebApi, JAX-RS, JERSEY, JACKSON(for JSON generation), JAXB(for xml generation), MAVEN( for POM.xml), Java
Tools: Eclipse, Maven, HEROKU cloud.
