import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLAppConnection {

	private final String USER_AGENT = "Mozilla/5.0";

	private final String GET_URL = "http://localhost:3000";

    OutputStream output = null;
    // public HttpURLAppConnection() {

    // }

	public void sendGET() throws IOException {
		URL obj = new URL(GET_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
        // con.setRequestProperty("Content-Type", "text/html");
        con.setDoOutput(true);
        output = con.getOutputStream();
        System.out.println(output);
		// int responseCode = con.getResponseCode();
		// System.out.println("GET Response Code :: " + responseCode);
		// if (responseCode == HttpURLConnection.HTTP_OK) { // success
		//     System.out.println("GET ok");
		// } else {
		// 	System.out.println("GET request did not work.");
		// }
	}
}

