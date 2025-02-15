import java.util.Scanner;

public class Cal{
   public static void main(String []args){
	Scanner obj = new Scanner(System.in);
	System.out.println("1. Add\n2. Subtract\nEnter your (Sno) choice:");
	int x = obj.nextInt();
	System.out.println("Enter the 1st Number:");
	int y = obj.nextInt();
	System.out.println("Enter the 1st Number:");
	int z = obj.nextInt();
	if (x==1){
		System.out.println("The Sumation = "+(y+z));}
	else if (x==2){
		System.out.println("The Difference = "+(y-z));}
	else{
		System.out.println("Invalid Input");}
}}
