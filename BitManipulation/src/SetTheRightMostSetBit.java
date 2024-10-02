import java.util.Scanner;
public class SetTheRightMostSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Set Bit:"+setBit(num));
	}
	public static int setBit(int num) {
		return num|(num+1);
	}

}
