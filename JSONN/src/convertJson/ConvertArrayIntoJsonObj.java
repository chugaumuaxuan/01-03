package convertJson;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ConvertArrayIntoJsonObj {
	public static void main(String[] args) {
		int[] numbers = {1 , 2 , 3, 4, 5};
		
		Gson gson = new Gson();
		
		//convert array to Json String
		String numbersJson = gson.toJson(numbers);
		System.out.println(numbersJson);
		
	}
}
