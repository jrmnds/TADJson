package Aluno;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class GerarJson {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setRa("2018");
		aluno.setCpf("123456789");
		aluno.setIdade(22);
		aluno.setNome("Reginaldo Mendes");
		
		Gson gson = new Gson();
		String alunoJson = gson.toJson(aluno);
		
		try {
			FileWriter writer = new FileWriter("\\Users\\Junior Mendes\\Documents\\aluno.json");
			writer.write(alunoJson);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(alunoJson);
		
	}

}
