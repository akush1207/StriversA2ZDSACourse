import java.util.Scanner;
public class CheckIthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter i:");
		int i=sc.nextInt();
		System.out.println("Is Set Bit:"+isSetBit(num,i));
	}
	public static boolean isSetBit(int num,int i) {
		return ((num>>i)&1)==1;
	}

}
