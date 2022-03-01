package convertJson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.*;

public class Student {
	String name;
	int age;
	
	public Student() {}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
