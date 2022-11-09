package project;


import java.util.ArrayList;
import java.util.Scanner;

public class ReUnion
{
	ArrayList finalOrderList=new ArrayList<>();
	
	String choice;

	ReUnion(ArrayList al)
	{
		this.finalOrderList=al;
		System.out.println("Do you want to add some extra ingredients");
		System.out.println("Please select the Option");
        String ingredients[] = { "1.Cheese", "2.Spanich", "3.Capsicum","4.Baby-Corn","5.Olives","4.No extra ingredients"};
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
			  finalOrderList.add("Spanich");
		  }
		  if(choice.contains("3"))
		  {
			  finalOrderList.add("Capsicum");
		  }
          if(choice.contains("4"))
		  {
			  finalOrderList.add("Baby-Corn");
		  }
          if(choice.contains("5"))
		  {
			  finalOrderList.add("Olives");
		  }
		 // System.out.println(finalOrderList);
		   
        }
}