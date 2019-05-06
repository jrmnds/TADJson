package Cerveja;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class GerarJsonCerveja {

	public static void main(String[] args) {
		
		Cerveja itaipava = new Cerveja();
		
		itaipava.setNome("Itaipava Premium");
		itaipava.setAno("2019");
		itaipava.setMalte("Puro");
		itaipava.setMarca("Itaipava");
		
		Gson gs = new Gson();
		String CervejaJson = gs.toJson(itaipava);
		
		try {
			FileWriter f = new FileWriter("\\Users\\Junior Mendes\\Documents\\cerveja.json");
			f.write(CervejaJson);
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(CervejaJson);
	}

}
