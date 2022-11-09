package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int ch;
	
	public static void main(String[] args)
	{
		ArrayList orderlist=new ArrayList();
		
		System.out.println("==================================");
        System.out.println("WELCOME TO THE PIZZA-CRAVING");
        System.out.println("==================================");
    
        System.out.println();
        System.out.println("-------Our Pizza's Cuisine----------");
        System.out.println();
    
        String arr[] = {"1. Regular Pizza","2. Jain Pizza","3. Non-Veg Pizza","4. Exit"};
        for (String Arr : arr) {
            System.out.println(Arr);    
        }
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Please enter your choice according to the serial number");
        Category cat=new Category(orderlist);
        Boolean flag = true;
        while(flag){
            System.out.print("Enter the valid number here -> ");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

        switch(ch){  
            case 1:
                System.out.println();
                System.out.println("You have selected the Regular Pizza"); 
                orderlist.add("Regular");
                cat.Choice();
                flag = false;
                break;
            case 2:
                System.out.println();
                System.out.println("You have selected the Jain Pizza");
                orderlist.add("JainPizza");
                cat.Choice();       
                flag = false;        
                break;
            case 3: 
                System.out.println();
                System.out.println("You have selected the Non-Veg Pizza");
                orderlist.add("Non-Veg");
                cat.Choice();
                flag = false;
                break;
            case 4: 
                System.out.println("Shop again");
                flag = false;
                break;
            default:
                System.out.println("You have entered the wrong serial Number");
                break;
            }
	    }
    }
}
