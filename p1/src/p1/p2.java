package p1;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no:");
		int no1= sc.nextInt();
		
		System.out.println("Entetr 2nd no:");
		int no2= sc.nextInt();
		
		System.out.println("Entetr 3rd no:");
		int no3= sc.nextInt();
		
		System.out.println("\n");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		int ch=sc.nextInt();
		
		int ans=0;
		switch(ch){
		case 1:{
			ans=no1+no2+no3;
			System.out.println("Addition is:"+ans);
			break;
			}
			
		case 2:{
				
			ans=no1-no2-no3;
			System.out.println("Subtraction is:"+ans);
			break;
			
			}
		
		case 3:{
			
			ans=no1*no2*no3;
			System.out.println("Mutiplication is:"+ans);
			break;
		}
		
		}
		}
	}
		

	


