package project;

import java.lang.*;
import java.util.*;
import java.io.*;


public class FileCustomer {

  private File file;        
  private FileWriter writer; 
  private FileReader reader; 
  private BufferedReader bfr;   
  
   public void writeInFile(String a,String b,String c,String d,String e)
   {
    try
    {
      file = new File("Info.txt");
      file.createNewFile();        
      writer = new FileWriter(file, true);
      writer.write("Customer Name- "+a+"\nCustomer NID Number: "+b+"\nCustomer Phone Number: "+c+"\nCustomer Address: "+d+"\nCustomer Email: "+e+"\r"+"\n"+"\n"); 
      writer.flush();            
      writer.close();            
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
  }
  
  public void readFromFile()
  {    
    try
    {
      reader = new FileReader(file); 
      bfr = new BufferedReader(reader);
      String text="", temp;         
      
      while((temp=bfr.readLine())!=null)
      {
        text=text+temp+"\n"+"\r"; 
      }
      
      System.out.println(text);   
      reader.close();             
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
  }
  
}
