package pppppppp;

//*******************************************************************
//takes the transpose of a matrix!
//*******************************************************************

import java.util.*;
import java.io.*;

public class qwertyuiop {

public static int[][] qwerty = new int[5][6];

public static void main(String[] args) throws IOException
{

  function(takeinput());

}
public static int[][] function(int[][] input){
  int[][] output = new int[input[0].length][input.length];
  for (int i = 0; i< input.length; i++){
    for( int j=0; j< input[0].length; j++){
      output[j][i] = input[i][j];
    }
  } 
  printarray(output);
  return output;
}

public static void printarray(int[][]  input){
  int count = 0;
  for (int i = 0; i<input.length; i++){
    for( int j=0; j< input[0].length; j++){

      System.out.print (input[i][j]+" ");
    }
    System.out.println(" "); 
  } 
}

public static int[][] takeinput() throws IOException
{
  BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
  

    	System.out.println("#Rows? ");
  	int rows = Integer.parseInt(sc.readLine());
    System.out.println("#Columns?");
    int columns = Integer.parseInt(sc.readLine());
    
    int[][] output = new int[rows][columns];
    System.out.println("type in numbers, one row at a time" );
    for (int i = 0; i< rows; i++)
    {
      for(int k = 0; k<columns; k++)
      {
        output[i][k] = Integer.parseInt(sc.readLine());
      }
    }
    
  return output;
  
}

}