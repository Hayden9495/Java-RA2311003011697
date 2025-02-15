import java.util.Scanner;

public class Simple_Interest{
   public static void main(String []args){
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the principle amt: ");
	int principle = obj.nextInt();
	System.out.println("Enter the Interest: ");
	float interest = obj.nextFloat();
	System.out.println("Enter the no.of years: ");
	int year = obj.nextInt();
	float sim_int = 0;
	for(int i=0;i<year;i++){
		sim_int = sim_int + (principle*interest/100);};
	System.out.println("The Simple Interest value = "+sim_int);
	System.out.println("The Total value = "+(sim_int+principle));
}
}