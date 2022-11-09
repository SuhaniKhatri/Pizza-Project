package project;


import java.util.ArrayList;
import java.util.Scanner;

public class Tomchi
{
	ArrayList finalOrderList=new ArrayList<>();
	
	String choice;

	Tomchi(ArrayList al)
	{
		this.finalOrderList=al;
		System.out.println("Do you want to add some extra ingredients");
		System.out.println("Please select the Option");
        String ingredients[] = { "1.onion", "2.tomato", "3.chilly & cheese","4.No extra ingredients"};
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
			  finalOrderList.add("onion");
		  }
		  if(choice.contains("2"))
		  {
			  finalOrderList.add("tomato");
		  }
		  if(choice.contains("3"))
		  {
			  finalOrderList.add("chilly & cheese");
		  }
		 // System.out.println(finalOrderList);
		   
}
}