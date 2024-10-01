import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {

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
		bubbleSort(arr,len);
		System.out.println("arr:"+Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr,int len) {
		for(int i=0;i<len;i++) {
			boolean swapped=false;
			for(int j=0;j<(len-1-i);j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

}
