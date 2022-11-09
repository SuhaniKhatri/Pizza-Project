package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {
    int choice;
    ArrayList orderlist = new ArrayList();

    public Category(ArrayList al) {
        this.orderlist = al;
    }

    public void Choice(){
		
		 System.out.println();
	        System.out.println("*****We have 3 Categories in our Cuisine*****");
	        String cat[] = { "1. Classic", "2. Premium", "3. Supreme" };
	        for (String catArr : cat) {
	            System.out.println(catArr);
	        }
	        
	        System.out.println("-------------------------------------------------------");
	        System.out.println("What do you want");
	        System.out.print("Enter your choice here -> ");
	        
	       
	        Scanner sc = new Scanner(System.in);
	        choice = sc.nextInt();
	        
	        switch(choice) {
	            case 1:
	                System.out.println();
	                System.out.println("You chooses the classic");
	                orderlist.add("classic");
				  //  System.out.println(orderlist);
	                Classic cl=new Classic(orderlist);
	                cl.choice();
	                break;
	            case 2:
	                System.out.println();
	                System.out.println("You chooses the Premium");
	                orderlist.add("premium");
					Premium pl = new Premium(orderlist);
					pl.choice();
	                break;
	            case 3:
	                System.out.println();
	                System.out.println("You chooses the Supreme");
	                orderlist.add("Supreme");
					Supreme sl = new Supreme(orderlist);
					sl.choice();
	                break;
	            default:
	                System.out.println("You have entered the wrong serial Number");
	                break;
                }
	}
}


