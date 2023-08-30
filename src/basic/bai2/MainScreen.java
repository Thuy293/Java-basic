package basic.bai2;
import java.util.Scanner;
public class MainScreen {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int N;
		
	   do {	System.out.print("Nhap so nguyen N = ");
		 N = scanner.nextInt();
		}	
		while (N<=0);
		System.out.println("N = " + N);
		
		
		int sum = 0;
		int differ = 0;
		
	    for (int i=0; i <= N; i++) {
	    	if (i%2==0) { 
	    	sum = sum + i;
	    	}
	    	else { 
	    	differ = differ + i;
	    	}    	
	    }	
	    System.out.println("Tong cac so chan:" + " " +sum);
    	System.out.println("Tong cac so le:" + " " + differ);
    	
	    int count = 0;
	    for (int i=0; i <= N; i++) {
	    	if (i%3==0 && i%2 != 0) {
	    		count = count +1;
	    	}
	    }
	    System.out.println("Dem cac so chia het cho 3 va khong chia het cho 2:" + " " +count);
	}

}
