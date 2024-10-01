import java.util.Arrays;
import java.util.Scanner;

public class RecursiveInsertionSort {

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
		insertionSort(arr,0,len);
		System.out.println("arr:"+Arrays.toString(arr));

	}
	public static void insertionSort(int[] arr,int i,int len) {
		if(i==len) {
			return;
		}
		int j=i;
		while(j>0 && arr[j-1]>arr[j]) {
			int temp=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;
			j--;
		}
		insertionSort(arr,i+1,len);
	}

}
