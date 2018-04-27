package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import helloworldmvc.contract.IModel;

public class Model implements IModel{

	public String getHelloWorld() {
		return null;
	}
	
	public void creationFichierTXT() {
		
		File fichierTXT = new File("C://Users/CESI Exia/Desktop/document.txt") ;
		
		if(!fichierTXT.exists())
		{
			try 
			{
				fichierTXT.createNewFile();
			} catch (IOException e) 
			
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} 
		
	}
	
	public void ecritureFichierTXT() {
		
		File fichierTXT = new File("C://Users/CESI Exia/Desktop/document.txt") ;
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(fichierTXT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedWriter bw = new BufferedWriter(writer);

		try {
			bw.write("Hello World !");
			bw.newLine();
			bw.close();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void lectureFichierTXT() {
		
		File fichierTXT = new File("C://Users/CESI Exia/Desktop/document.txt") ;
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(fichierTXT), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line = null;
		try {
			line = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		while(line != null) {
			System.out.println(line);
			try {
				line = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
