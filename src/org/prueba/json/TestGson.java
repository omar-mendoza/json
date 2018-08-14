package org.prueba.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.prueba.model.Data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestGson {

	public static void main(String[] args) throws IOException {
		
		String data = new String(Files.readAllBytes(Paths.get("data.json")));		
		//System.out.println(data);
		
		Gson gson  = new GsonBuilder().setPrettyPrinting().create();
		Data datos = gson.fromJson(data, Data.class);
		
		System.out.println(datos);
	}

}
