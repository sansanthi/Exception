/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

public class MultipleTryCatch {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
             a[5]=30/0;
        }catch(ArithmeticException e){
            System.out.println("Task 1 is completed");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Task 2 is completed");
        }
       
        
    }
 
}
