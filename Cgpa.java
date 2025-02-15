package MyPack.java;

import java.util.Scanner;
import java.util.Arrays;

public static float Cal_cgpa(int a,String b){

}

public class Cgpa{
    public static void main(String []args){
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the no.of.subjects");
	
	int sub = obj.nextInt();
	int total_credits = 0;
	String[] grade = new String[sub];
	int[] credits = new int[sub];
	// Getting input grades
	
	for(int i=1; i<=sub;i++){
		int cre;
		System.out.println(i+"Enter the no.of.Credits");
		cre = obj.nextInt();
		total_credits += cre;
		credits[i] = cre;
		System.out.println(i+"Enter the Grade");
		grade[i] = obj.nextLine();
	}
	// Calculating Cgpa
	float cgpa = 0.0;
	for(int i=0;i<=sub;i++){
		Cal_cgpa(credits[i],grade[i]);
	}
}	
}
