import java.util.Scanner;
// this is simple calculator :) 
public class App {
	public static  void Factorial(double num1) {
		 long fact=1;
		for(int i=1;i<=num1;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public  static void Plus(double num1,double num2) {
		System.out.println(num1+num2);
	}
	public static void Minus(double num1,double num2) {
		System.out.println(num1-num2);
	}
	public static void multiply(double num1,double num2) {
		System.out.println(num1*num2);
	}
	public static  void divide(double num1,double num2) {
		System.out.println(num1/num2);
	}
	
	
	

	public static void main(String[] args) {
		double num1;
		double num2;
		char sign;
		System.out.println("Enter first number: ");
		Scanner bla=new Scanner(System.in);
		
		num1=bla.nextDouble();
		
		
		Scanner Sign=new Scanner(System.in);
		System.out.println("Enter sign(!,+,-,*,/) :");
		sign=Sign.next().charAt(0);
		if(sign=='!') {
			Factorial(num1);
			
		}else {
			Scanner Num2=new Scanner(System.in);
			System.out.println("Enter Second  number: ");
			num2=Num2.nextDouble();
			
			if(sign=='+')Plus(num1,num2);
			else if(sign=='-') {Minus(num1,num2);}
			else if(sign=='*') {multiply(num1,num2);}
			else if(sign=='/') {divide(num1,num2);}
			else {
				System.out.println("Error!");
			}
			
			
		}
		

		
	}

}
