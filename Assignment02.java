import java.io.IOException;

import org.jsoup.Connection;
//import java.sql.Connection;
//import jsoup-1.15.3.jar;
//import org.jsoup;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;

//import org.w3c.dom.Document;

//import javax.swing.text.Document;

//TODO:
//property file is just a txt file
//read like a regular text file
//can use java.util.properties
//

public class Assignment02 {	

	public String getWebpageContent(String url) throws IOException {
		Connection conn = Jsoup.connect(url);
		Document doc = conn.get();
		String result = doc.body().text();
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println("main");
	}
}
