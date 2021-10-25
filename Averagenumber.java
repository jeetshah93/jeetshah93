package javapractice1;
import java.util.
class Average
{
	double avg;
	Average(double a, double b, double c,double d, double e)
	{
	 avg= (a+b+c+d+e)/3;
 
	}
}
class AverageNumber
{
   public static void main(String args[]) 
    {   
      Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of a1");
      double a1= sc.nextDouble();   
System.out.println("Enter the value of a2");
      double a2= sc.nextDouble();      
System.out.println("Enter the value of a3");
      double a3= sc.nextDouble(); 
      System.out.println("Enter the value of a3");
      double a4= sc.nextDouble();
      System.out.println("Enter the value of a3");
      double a5= sc.nextDouble();
      Average obj =new Average(a1, a2, a3,a4,a5);
	  System.out.println("Average of 5 number is :" + obj.avg);      
   }
 }

