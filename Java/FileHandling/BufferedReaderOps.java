package com.kodnest.filehandling.BufferedOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    FileReader fr = null;
    FileWriter fw = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    
    try {
    	String path1 = "";
    	String path2 = "";
    	
    	fr = new FileReader(path1);
    	fw = new FileWriter(path2);
    	br = new BufferedReader(fr);
    	bw = new BufferedWriter(fw);
    	
    	String x;
    	while((x=br.readLine())!=null) {
    		bw.write(x);
    	}
    	bw.flush();
    }catch(FileNotFoundException e) {
    	e.printStackTrace();
    }catch(IOException e) {
    	e.printStackTrace();
    }finally {
    	try {
    		br.close();
    		bw.close();
    		fr.close();
    		fw.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	}

}
