import java.util.Scanner;
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Single Number:"+singleNumber(arr));
	}
	public static int singleNumber(int[] arr) {
        int ans=0;
        for(int a:arr){
            ans^=a;
        }
        return ans;
    }

}
