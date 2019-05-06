package Cerveja;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class CervejaLerJson {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		try {
			BufferedReader arquivoCerveja = new BufferedReader(new FileReader(
					"\\Users\\Junior Mendes\\Documents\\cerveja.json"));
			
			Cerveja cerveja = (Cerveja) gson.fromJson(arquivoCerveja, Cerveja.class);
			
			System.out.println(cerveja);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}

}
