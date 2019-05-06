package Aluno;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class LerJson {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		try {
			BufferedReader arquivoAluno = new BufferedReader(new  FileReader(
					"\\Users\\Junior Mendes\\Documents\\aluno.json"));
			
			Aluno aluno = (Aluno) gson.fromJson(arquivoAluno, Aluno.class);
			
			System.out.println(aluno);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}

}