import java.util.Scanner;

public class findMax{
	public int maxof(int a,int b,int c){
		int temp;
		if(a>b){
			temp = a;}
		else
			{temp = b;}
		if(temp < c)
			{temp = c;}
	System.out.println("The max of the numbers is = "+temp);
}   
public void main(String []args){
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the 1st Number:");
	int x = obj.nextInt();
	System.out.println("Enter the 2nd Number:");
	int y = obj.nextInt();
	System.out.println("Enter the 3rd Number:");
	int z = obj.nextInt();
	
	maxof(x,y,z);
	
}
}

