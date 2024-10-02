import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.println(num+" is "+oddEven(num));
	}
	public static String oddEven(int num) {
		if((num&1)==1) {
			return "Odd";
		}else {
			return "Even";
		}
	}

}
