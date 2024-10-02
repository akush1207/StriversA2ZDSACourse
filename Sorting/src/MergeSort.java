import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class MergeSort {

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
		mergeSort(arr,0,len-1);
		System.out.println("arr:"+Arrays.toString(arr));
	}
	public static void merge(int[]arr,int low,int mid,int high) {
		ArrayList<Integer> temp=new ArrayList<>();
		int left=low,right=mid+1;
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
		}
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		for(int i=low;i<=high;i++) {
			arr[i]=temp.get(i-low);
		}
	}
	public static void mergeSort(int[] arr,int low,int high) {
		if(low>=high) {
			return;
		}
		int mid=(low+high)>>1;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}

}
