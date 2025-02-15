import java.util.Scanner;

public class Sign{
   public static void main(String []args){
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int x = obj.nextInt();
	if (x>0){
		System.out.println("The number is positive");}
	else if (x<0){
		System.out.println("The number is negative");}
	else{
		System.out.println("The number is zero");}
}}
