package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Classic
{
	int reg=135,med=210,lar=360;
	
	int choice;
	Scanner sc = new Scanner(System.in);
	int sub_choice;

	ArrayList orderList=new ArrayList();
	 
	Classic(ArrayList al){
		
		this.orderList=al;
		
		 System.out.println("Please select the size");
	        String size[] = { "Regular", "Medium", "Large" };
	        for (String arr : size) {
	            System.out.println(arr);
	        }
	}
	
	public void choice()
	{

		
	    choice = sc.nextInt();
	    switch (choice) {
	        case 1:
	            System.out.println();
	            System.out.println("You chooses the Regular");
	         
	            orderList.add("Regular");
	            orderList.add(reg);
	            sub_cat();
	            break;
	        case 2:
	            System.out.println();
	            System.out.println("You chooses the medium");
	           
	            orderList.add("medium");
	            orderList.add(med);
	            sub_cat();
	            break;
	        case 3:
	            System.out.println();
	            System.out.println("You chooses the large");
	          
	            orderList.add("large");
	            orderList.add(lar);
	            sub_cat();
	            break;
	    
	        default:
	            System.out.println("You have entered the wrong serial Number");
	            break;
        }
    }
	
	public void sub_cat()
	{
		 System.out.println("Please select the sub_categpry");
	        String size[] = { "1-Tomchi->tomato,onion,chilly & cheese", "2-Caponito->capsicum,onion,tomato & cheese"};
	        for (String arr : size) {
	            System.out.println(arr);
	        }
	        sub_choice = sc.nextInt();
	        
	        switch (sub_choice) {
	        case 1:
	            System.out.println();
	            orderList.add("Tomchi");
	            System.out.println("You chooses the Tomchi");
				Tomchi tom=new Tomchi(orderList);
	            tom.ingredient_selection();
	            break;
	        case 2:
	            System.out.println();
	            orderList.add("Caponito");
	            System.out.println("You chooses the Caponito");
				Caponito cap = new Caponito(orderList);
				cap.ingredient_selection();
	            break;
	        default:
	            System.out.println("You have entered the wrong serial Number");
	            break;
	        }
	        
	    System.out.println(orderList);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Confirm Your order");
		System.out.println("Press 1 to place your order");
		System.out.println("press 0 to cancel your order");
		int col = sc.nextInt();
		if(col==1){
			System.out.println("Your order is placed");
		}else{
			System.out.println("Your order is canceled");
		}
		System.out.println();
		System.out.println("****************Thankyou*******************************");
		System.out.println("***************Visit Again******************************");

	}
}