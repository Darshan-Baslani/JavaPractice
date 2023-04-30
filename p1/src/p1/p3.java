package p1;
import java.util.*;

public class p3 {

	public static final void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList ar=new ArrayList();
		
		while(true){
			System.out.println("Enter no:");
			int a=sc.nextInt();
		
			if(a==0) {
				break;
			}
			
			ar.add(a);
			}

		int ans=0;
		for(int l = 0;l<ar.size();l++) {
			ans=ans+(int)ar.get(l);
					}
	System.out.println("Addition is: "+ans);
	double avg=(double) ans/ar.size();
	System.out.println("Average is: "+avg);
	
	}
}