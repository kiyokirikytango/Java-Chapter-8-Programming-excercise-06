/*
Chapter 8 Programming excercise 06
Riky Hernandez
9/21/21
Description: A program that uses a method to multiply two matrixs
`;-.          ___,
  `.`\_...._/`.-"`
    \        /      ,
    /()   () \    .' `-._
   |)  .    ()\  /   _.'
   \  -'-     ,; '. <
    ;.__     ,;|   > \
   / ,    / ,  |.-'.-'
  (_/    (_/ ,;|.<`
    \    ,     ;-`
     >   \    /
    (_,-'`> .'
          (_,'
 */
package chapter8_06;

import java.util.Scanner;


public class Chapter8_06 {

    public static double[][] multiplyMatrix( double [][] a , double [][] b){
       
        double[][] result = new double[a.length][b[0].length];
        for (int i =0 ; i < a.length; i++){                     //method that multiplys two matrixs
            for(int j = 0; j < result.length; j++){
                for(int k = 0; k < result[0].length; k++){
                    result [i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
   public static void printResult(double[][] a, double [][] b , double [][] c, char op){  //method to nicely dysplay the multpilcation
       for(int i = 0; i <a.length; i++ ){
           for (int j = 0; j < a[0].length; j++)
               System.out.print(" " + a[i][j]); //printig the first rox of matrix 1
           
           if (i == a.length/2)                     //the /2 is to be able to make sure we are in the second row to put the operation in the middle
               System.out.print("  " + op + "  ");
           else
               System.out.print("     ");             // if its not the middle row it just gets 5 spaces
           for (int j = 0; j < b[0].length; j++)
               System.out.printf(" " + b[i][j]);        //switcing to matrix 2
           
            if (i == a.length/2)
               System.out.print("  =  ");       //the /2 is to be able to make sure we are in the second row to put the equal sign in the middle
           else
               System.out.print("     ");            // if its not the middle row it just gets 5 spaces
            
              for (int j = 0; j < c[0].length; j++)
               System.out.print(" " + c[i][j]);         //the multipication of matrix 1 and 2
              
              System.out.println();         //this will make it jumo down down the row going over all the statements above 
       }
   }
    public static void main(String[] args) {
       
       Scanner input = new Scanner (System.in) ;
       final int N = 3;                           //representing the size of the matrix 3*3
       
       System.out.print("Enter matrix1: ");
       double [][] matrix1 = new double [N][N];         //user inputs first matrix, a 2dray
       for (int i = 0; i < matrix1.length; i++){
           for (int j = 0; j < matrix1[i].length; j++){
               matrix1[i][j] = input.nextDouble();
           }
       }
         System.out.print("Enter marix2: ");                //user inputs second matrix, a 2dray
       double [][] matrix2 = new double [N][N];
       for (int i = 0; i < matrix2.length; i++){
           for (int j = 0; j < matrix2[i].length; j++){
               matrix2[i][j] = input.nextDouble();
           }
       }
       
       double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);     //displays the calculation of the multiplication
       System.out.println("\nThe multiplication of the matrices is ");
       printResult(matrix1, matrix2, resultMatrix, '*');
    }
    
}
