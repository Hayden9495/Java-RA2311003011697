import java.util.Scanner;

public class Cal{
   public static void main(String []args){
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the Year: ");
	int x = obj.nextInt();
	if(x%4 == 0){
		if(x%100 !=0){
			System.out.println("It is a Leap Year");}
		else if(x%400 == 0){
			System.out.println("It is a Leap Year");}
		else{
			System.out.println("It is not a Leap Year");}
	}else{
		System.out.println("It is not a Leap Year");}
}}