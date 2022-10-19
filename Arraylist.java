import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Arraylist {

	public static void main(String[] args) {
		int n,a;
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Elemnets of you want to add : ");
		n = sc.nextInt();
		for(int i = 0;i < n;i++)
		{
			System.out.println("Enter a number : ");
			a = sc.nextInt();
			num.add(a);
		}
		int choice;
		do {
		System.out.println("1.Remove a Element.");
		System.out.println("2.Display Elements of ArrayList.");
		System.out.println("3.Check Index of a Element.");
		System.out.println("4.Sort the Elements of ArrayList.");
		System.out.println("5.Exit.");
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();
		
		switch(choice)
		{
		   case 1 :
			       int b;
			       System.out.println("Enter the index of Element to be removed : ");
			       b = sc.nextInt();
			       num.remove(b);
			       System.out.println(num);
			       break;
			       
		   case 2 :
			       System.out.println(num);
			       break;
			       
		   case 3 :
			       int c;
			      System.out.println("Enter the number to check the index : ");
			      c = sc.nextInt();
			      int index = num.indexOf(c);
			      System.out.println("The index of" +c+ " is " +index);
			      break;
			      
		   case 4 :
			       Collections.sort(num);
			       System.out.print("Sorted ArrayList is : " +num);
			       break;
			       
			default :
				     System.out.println("Invalid choice !!!");
				     break;
			       
			       
		
		  
	        }//switch(choice) 
		
		}while(choice != 5);

	}

}
