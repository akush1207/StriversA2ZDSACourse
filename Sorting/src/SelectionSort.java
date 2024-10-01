import java.util.Scanner;
import java.util.Arrays;
public class SelectionSort {

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
		selectionSort(arr,len);
		System.out.println("arr:"+Arrays.toString(arr));
	}
	public static void selectionSort(int[] arr,int len) {
		for(int i=0;i<len;i++) {
			int minInd=i;
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[minInd]) {
					minInd=j;
				}
			}
			int temp=arr[minInd];
			arr[minInd]=arr[i];
			arr[i]=temp;
		}
	}

}
