package finalprogramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadTextFile extends Read {

    
	
	public ReadTextFile(String path) {
		readFile(path);
	}

	public void readFile(String path) {
	    	
	        FileReader fr = null;
	        BufferedReader br = null;
	        
	        try {
	            fr = new FileReader(path);
	            br = new BufferedReader(fr);
	           
	            br.readLine();
	            	
	            String info = null;
	            while ( (info = br.readLine()) != null ){
	                	
	               String[] values = info.split("\\|");
	               ArrayList<String> information = new ArrayList<String>();
	                  
	               for (int i = 0; i < values.length; i++) {
	            	   information.add(values[i]);
	                }
	                  
	                if(information.size() != 0 )
	                	getArray().add(information);
	                  
	         } 
	        }catch (Exception e) {
	            e.getMessage();
	        } finally {
	            close(fr);
	            close(br);
	        }

	    	
	    }
	
	 public void close(FileReader fr) {
	        try {
	            if (fr != null)
	                fr.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public void close(BufferedReader br) {
	        try {
	            if (br != null)
	                br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

		
	    
}
