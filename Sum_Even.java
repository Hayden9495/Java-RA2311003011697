import java.util.Scanner;

public class Sum_Even{
   public static void main(String []args){
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the number:");
	int num = obj.nextInt()+1;
	int sum = 0;
	int count = 2;
	do{
		if(count%2 == 0)
			{sum += count;}
		count++;}while(num!=count);
	System.out.println("The Sum = "+sum);
}
}