/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author san
 */
public class TestTrycatch {
    public static void main(String[] args) {
        try{
           int data=50/0; 
        }catch(ArithmeticException e){
            System.out.println("ArithmeticEception"); 
        }
        
       System.out.println("rest of the code"); 
    }
}
