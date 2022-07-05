package com.hrodriguesdev.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ManipulateFiles {
	
	public static void writeFile(File arquivoProperties, List<String> configDefalt) {
		try (BufferedWriter bw1 = new BufferedWriter(new FileWriter(arquivoProperties))){
			for(String x : configDefalt) {
				bw1.write(x);
				bw1.newLine();
			}
		}
		catch (IOException e ) {
			e.printStackTrace();
		}
		
	}

	public static void createdDiretorioAndFile(List<String> configDefalt, String dirYggDrasil, String dirResource, String nameFileProperties) {
		
		try {
			File diretorio1 = new File(System.getProperty("user.home").toString() + dirYggDrasil);
			diretorio1.mkdir();
			File diretorio2 = new File(System.getProperty("user.home").toString() +dirResource);
			diretorio2.mkdir();
			File arquivoProperties = new File(diretorio2, nameFileProperties );
			if(!arquivoProperties.exists()) {
				arquivoProperties.createNewFile(); 
				writeFile(arquivoProperties, configDefalt);
			}
				
			
		}catch (IOException e1) {
			e1.printStackTrace(); 
		}catch (Exception e2) {
			e2.printStackTrace();
		}
	
	}

}
