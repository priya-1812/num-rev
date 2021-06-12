/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hp
*/
import java.util.Scanner;
public class Number {
    public static void main(String args[])
            {
                
           System.out.println("enter a number:");
           Scanner in=new Scanner(System.in);
           int num=in.nextInt();
           if(num*2==0 || num*3==0 || num*5==0)
           {
               System.out.println("number is a multiple");
           }
           else
               System.out.println(num*30);
            }
}


    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
    
    

