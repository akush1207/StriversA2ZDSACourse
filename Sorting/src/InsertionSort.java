import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {

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
		insertionSort(arr,len);
		System.out.println("arr:"+Arrays.toString(arr));
	}
	public static void insertionSort(int[] arr,int len) {
		for(int i=1;i<len;i++) {
			int key=arr[i],j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

}
