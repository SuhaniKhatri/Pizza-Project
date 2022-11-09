package project;


import java.util.ArrayList;
import java.util.Scanner;

public class Caponito
{
	ArrayList finalOrderList=new ArrayList<>();
	
	String choice;

	Caponito(ArrayList al)
	{
		this.finalOrderList=al;
		System.out.println("Do you want to add some extra ingredients");
		System.out.println("Please select the Option");
        String ingredients[] = { "1.Capsicum", "2.Onion", "3.tomato & cheese","4.No extra ingredients"};
        for (String arr : ingredients) {
            System.out.println(arr);
        }
        

}
	public void ingredient_selection()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter you selection seperated by (,)comma here->");
		  choice = sc.nextLine();
		  if(choice.contains("1"))
		  {
			  finalOrderList.add("Capsicum");
		  }
		  if(choice.contains("2"))
		  {
			  finalOrderList.add("Onion");
		  }
		  if(choice.contains("3"))
		  {
			  finalOrderList.add("tomato & cheese");
		  }
		 // System.out.println(finalOrderList);
		   
}
}