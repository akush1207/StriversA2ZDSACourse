import java.util.Arrays;
import java.util.Scanner;
public class SingleNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array length:");
		int len=sc.nextInt();
		int[] arr=new int[len];
		System.out.print("Enter array elements:");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Two number:"+Arrays.toString(twoNumber(arr)));
	}
	public static int[] twoNumber(int[] arr) {
		int ans1=0,ans2=0,xor=0;
		for(int a:arr) {
			xor^=a;
		}
		int rightMost=(xor^(xor-1))&xor;
		int b1=0,b2=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]&rightMost)!=0) {
				b1=b1^arr[i];
			}else{
				b2=b2^arr[i];
			}
		}
		return new int[] {b1,b2};
	}

}
