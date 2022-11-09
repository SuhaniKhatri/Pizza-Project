package project;


import java.util.ArrayList;
import java.util.Scanner;

public class PartyLover
{
	ArrayList finalOrderList=new ArrayList<>();
	
	String choice;

	PartyLover(ArrayList al)
	{
		this.finalOrderList=al;
		System.out.println("Do you want to add some extra ingredients");
		System.out.println("Please select the Option");
        String ingredients[] = { "1.Cheese", "2.Sweet-Corn", "3.Capsicum", "4.Tomato", "5.No extra ingredients"};
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
          if(choice.contains("4"))
		  {
			  finalOrderList.add("Tomato");
		  }
		//  System.out.println(finalOrderList);
		   
}
}