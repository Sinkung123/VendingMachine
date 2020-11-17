/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class VendingMachine {
    public static void main(String[] args) {
        int sc;
        int count = -1;
        String [] menu = {null,"Milk","Lay","Water"};
        int [] stockList = {0,10,5,2};
        int [] price = {0,10,20,30};
        String Menu = 
            "MENU"
            +"\n1.Milk" 
            + "\n2.Lay" 
            + "\n3.Water"
            + "\n4.OK";
    
        Scanner src = new Scanner (System.in);
        System.out.println(Menu);
               
        do{           
            System.out.print("Select Menu : ");
            sc = src.nextInt();
                switch(sc){
                    case 1 :
                        System.out.println("Select : "+ menu[sc]);
                        System.out.println("Price : " + price[sc]);
                        --stockList[sc];
                        break;
                    case 2 :
                        System.out.println("Select : "+ menu[sc]);
                        System.out.println("Price : " + price[sc]);
                        --stockList[sc];
                        break;
                    case 3 :
                        System.out.println("Select : "+ menu[sc]);
                        System.out.println("Price : " + price[sc]);
                        --stockList[sc];
                        break;
                    case 4 :
                        System.out.println("Select : "+ menu[sc]);
                        System.out.println("Price : " + price[sc]);
                        --stockList[sc];
                        break;
                }
                
            
            
            
           
            
        }while(sc != 4);
        
    }
    
        
        
    
            
    
}
