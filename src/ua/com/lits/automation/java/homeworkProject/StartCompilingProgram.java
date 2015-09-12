package ua.com.lits.automation.java.homeworkProject;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.core.JsonParseException;

public class StartCompilingProgram {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		InputStream input = new FileInputStream("infoOnStudents.json");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		TypeFactory typeFactory = TypeFactory.defaultInstance();
		List<ParseData> parseData = objectMapper.readValue(input,
				typeFactory.constructCollectionType(ArrayList.class, ParseData.class));
		
		for (ParseData item : parseData) {
			
			System.out.println(item.getSurname() + "\t" + item.getPost().concat(":") + "\t" + item.getSalary() + " $");
		}
	}

}