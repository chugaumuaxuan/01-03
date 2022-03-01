package convertJson;


import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "Nguyen";
		st1.age = 12;
		
		//convert object to Json
		Gson gson = new Gson();
		String JsonData = gson.toJson(st1);
		System.out.println(JsonData);
		
		//conver Json to object
		Type objectType = new TypeToken<Student>(){}.getType();
		Student st2 = gson.fromJson(JsonData, objectType);
		System.out.println(st2.name + st2.age);
	}
}
