import java.util.Scanner;

public class Temp{
   public static void main(String []args){
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the temperature:");
	float x = obj.nextFloat();
	if (x>30){
		System.out.println("It's hot!");}
	else if(x<10){
		System.out.println("It's cold!");}
	else if(x<20){
		System.out.println("It's cool.");}
	else{
		System.out.println("It's warm");}
}}