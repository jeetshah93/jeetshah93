package javaexample;
import java.util.*;
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the  1st number" );
int x= sc.nextInt();
System.out.println("enter the 2 number");
int y=sc.nextInt();
int gcd=0;
for (int i=1;i<=x&&i<=y;i++) {
	if (x%i==0&&y%i==0) {
		gcd=i;
		
	}
}
	System.out.println("gcd number is"+gcd);

	}

}
