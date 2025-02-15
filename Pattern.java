import java.util.Scanner;

public class Simple_Interest{
   public static void main(String []args){
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the no.of rows:");
	int rows = obj.nextInt();
	int count = 1;
	while(rows>0){
		for(int i=0;i<count;i++){
			System.out.print("*");}
		System.out.print("\n");
		count++;
		rows--;}
}
}