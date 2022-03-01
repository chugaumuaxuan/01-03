package convertJson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONtoJavaObj {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om = new ObjectMapper();
		
		File jsonFile = new File("C:\\Users\\Admin\\Desktop\\test.json");
		
		Student stu = om.readValue(jsonFile, Student.class);
		
		System.out.println(stu.getName());
	}
}
