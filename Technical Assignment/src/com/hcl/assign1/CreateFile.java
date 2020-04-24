package com.hcl.assign1;
import java.io.File;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File file=new File("C:\\java\\Assignment\\src\\com\\hcl\\assign1\\notes.ini");
     boolean result;
     try
     {
    	 result=file.createNewFile();
    	 if(result)
    	 {
    		 System.out.println("file created "+file.getCanonicalPath());
    	 }
    	 else
    	 {
    		 System.out.println("File already exists at location : "+file.getCanonicalPath());
    	 }
     }
     catch(IOException e)
     {
    	 e.printStackTrace();
     }
	}

}
