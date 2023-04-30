package p1;
import java.util.*;
public class p7 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	ArrayList ar=new ArrayList();
	while(true) {
		System.out.println("Enter no: ");
		int a = sc.nextInt();
		
		if(a==0) {
			break;
		}
		ar.add(a);
	}
	int sum=0;
	
	for(int i=0;i<ar.size();i++) {
		sum=sum+(int)ar.get(i);
	}
	System.out.println("Sum is: "+sum);
	double avg=(double)sum/ar.size();
	System.out.println("Average is: "+avg);
	}

}
