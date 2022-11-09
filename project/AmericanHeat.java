package project;


import java.util.ArrayList;
import java.util.Scanner;

public class AmericanHeat
{
	ArrayList finalOrderList=new ArrayList<>();
	
	String choice;

	AmericanHeat(ArrayList al)
	{
		this.finalOrderList=al;
		System.out.println("Do you want to add some extra ingredients");
		System.out.println("Please select the Option");
        String ingredients[] = { "1.Cheese", "2.Baby-Corn", "3.Capsicum", "5.No extra ingredients"};
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
			  finalOrderList.add("Cheese");
		  }
		  if(choice.contains("2"))
		  {
			  finalOrderList.add("Sweet-Corn");
		  }
		  if(choice.contains("3"))
		  {
			  finalOrderList.add("Capsicum");
		  }
		//  System.out.println(finalOrderList);
		   
}
}