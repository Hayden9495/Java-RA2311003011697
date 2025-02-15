import java.util.Scanner;

public class Choice{
   public static void main(String []args){
	Scanner obj = new Scanner(System.in);
	System.out.println("1. Juice\n2. Soda\nEnter your (Sno) choice:");
	int x = obj.nextInt();
	switch(x){
	case 1:
		System.out.println("Dispensing Juice");
		break;
	case 2:
		System.out.println("Dispensing Soda");
		break;
	default:
		System.out.println("Invaild choice");
}
}
}