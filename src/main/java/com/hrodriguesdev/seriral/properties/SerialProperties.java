package com.hrodriguesdev.seriral.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hrodriguesdev.files.ManipulateFiles;


public class SerialProperties {
    private String porta;
    private int baud = 0;
    private int timeout = 0;
    private int stopBits = 0;
    private String paridade = "None";

    public SerialProperties(String dirYggDrasil, String dirResource, String nameFileProperties){
    	String pathToProperties;
    	ManipulateFiles.createdDiretorioAndFile(configDefalt(), dirYggDrasil, dirResource, nameFileProperties);    	
    	pathToProperties = System.getProperty("user.home").toString() + dirResource +"\\" + nameFileProperties;
  
    	if(pathToProperties!=null)
    		try(BufferedReader br = new BufferedReader(new FileReader(pathToProperties) ) ){
    			String itemsProperties = br.readLine();
    			String[] line = new String[5];
				int i = 0;
    			while(itemsProperties != null) {				
					line[i] = itemsProperties;								
					itemsProperties = br.readLine();
					i++;
					
				}	
				if(!line[0].isEmpty())
					baud =Integer.parseInt(line[0]);
				if(!line[1].isEmpty())
					stopBits =Integer.parseInt(line[1]);
				if(!line[2].isEmpty())
					porta =line[2] ;
				
	    	}catch (IOException e) {
				System.out.println(e.getMessage());
				
			}catch(NullPointerException e) {
				System.out.println("Falha no caminho do arquivo de propriedades!");
				
			}
	}
	
	private List<String> configDefalt(){
		List<String> list = new ArrayList<>();
		list.add("9600");
		list.add("1");
		if(porta!=null) {
			list.add(porta);
		}
		
		return list;
	}

	public String getPorta() {
        return porta;
    }

    public int getBaud() {
        return baud;
    }

    public int getTimeout() {
        return timeout;
    }
    
    public int getStopBits() {
        return stopBits;
    }

	public String getParidade() {
		return paridade;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}
	
}
