
package crabfood;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CrabFood {

    public static void main (String[]args){
      try{
        Scanner in = new Scanner(new FileInputStream("input.txt"));
        String [] all = new String[32];
        String [] restaurant = new String[2];
        String [] dish = new String[9];
     //   int []map = new int[10];
        int line = 0;
        int j = 0;
        while(in.hasNextLine()){
             all[line] = in.nextLine();
             line++;
        }
        
        in.close();
      }catch(Exception e){
          System.out.println("File not found.");
      }
    }
	
}


    

