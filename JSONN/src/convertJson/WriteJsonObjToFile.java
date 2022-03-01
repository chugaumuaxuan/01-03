package convertJson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

public class WriteJsonObjToFile {
	
	public static void main(String[] args) {
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "Pham");
		jsonObj.put("age", 12);
		
		try {
			FileWriter filewriter = new FileWriter("C:/Users/Admin/Desktop/test2.json");
			filewriter.write(jsonObj.toString());
			filewriter.flush();
			filewriter.close(); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
