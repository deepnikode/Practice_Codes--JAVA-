import java.io.IOException;
import java.net.URI; 
import java.net.http.HttpClient; 
import java.net.http.HttpRequest; 
import java.net.http.HttpResponse;

public class ApiCall
{
	public static void main(String[] args) throws IOException,InterruptedException
	{

	var url= "https://dummyjson.com/users";
		
	var request=HttpRequest.newBuilder()
				.GET()
				.uri(URI.create(url))
				.build();
		
	var client=HttpClient.newBuilder().build();

	var response=client.send(request, HttpResponse.BodyHandlers.ofString());

	System.out.println(response.statusCode());

	System.out.println(response.body());	
		
	}
}