/*
  Author: Zhe
  
  This Utility class houses all the custom methods
  that support my text adventure.
  
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utility{
  //this method opens a file and print out each line
  
  public void readfile(String fileName){
    String currentLine; // hold current line being read in file
    
    // trying to open a file to read
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
      
      // read each line in the file until the EOP
      while ((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
      // if there is no file to open, the exception will be caught
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}