import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length:");
		int len=sc.nextInt();
		int[] nums=new int[len];
		System.out.println("Enter array elements:");
		for(int i=0;i<len;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("Subset:"+subsets(nums));
	}
	public static List<List<Integer>> subsets(int[] nums){
		int n=nums.length;
		int num=1<<n;
		List<List<Integer>> ans=new ArrayList<>();
		for(int i=0;i<num;i++) {
			List<Integer> temp=new ArrayList<>();
			for(int j=0;j<n;j++) {
				if((i&(1<<j))!=0) {
					temp.add(nums[j]);
				}
			}
			ans.add(new ArrayList<>(temp));
		}
		return ans;
	}

}
