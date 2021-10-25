package javapractice;

public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int var=100;
Integer i=var;//autoboxing

//int n=i.intValue();
int n=i;//auto unboxing
String s="12";
int n1=Integer.parseInt(s);
Integer j=Integer.valueOf(s);

System.out.println(n1+" \n"+j);
	}

}
