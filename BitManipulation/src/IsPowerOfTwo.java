import java.util.Scanner;
public class IsPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Is "+num+" power of 2:"+isPowerOf2(num));
	}
	public static boolean isPowerOf2(int num) {
		if(num==0) {
			return false;
		}
		if(num==Integer.MIN_VALUE) {
			return false;
		}
		return (num&(num-1))==0;
	}

}
