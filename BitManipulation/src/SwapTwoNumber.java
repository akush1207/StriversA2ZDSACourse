import java.util.Scanner;
public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping:  a:"+a+" b:"+b);
		swap(a,b);
	}
	public static void swap(int a,int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping:   a:"+a+" b:"+b);
	}

}
