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
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            System.out.println(a/b);
            
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("print");
    }
    }
    
}
