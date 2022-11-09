package project;


import java.util.ArrayList;
import java.util.Scanner;

public class RedIndian
{
	ArrayList finalOrderList=new ArrayList<>();
	
	String choice;

	RedIndian(ArrayList al)
	{
		this.finalOrderList=al;
		System.out.println("Do you want to add some extra ingredients");
		System.out.println("Please select the Option");
        String ingredients[] = { "1.Cheese", "2.Paneer", "3.Chilly","4.No extra ingredients"};
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
			  finalOrderList.add("Paneer");
		  }
		  if(choice.contains("3"))
		  {
			  finalOrderList.add("Chilly");
		  }
		//  System.out.println(finalOrderList);
		   
}
}