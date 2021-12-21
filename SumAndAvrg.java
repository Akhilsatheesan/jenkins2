package Sum.ust;

import java.util.Scanner;

public class SumAndAvrg {
public static void main(String[] args) {
	int s=0;
	int n=0;
	System.out.println("Enter 5 numbers:");
	for (int i=1;i<=5;i++) {
		Scanner num =new Scanner(System.in);
		n =num.nextInt();
		s=s+n;
	}
	float avg = s/5;
	System.out.println("sum= "+s);
	System.out.println("average= "+avg);
}
}
