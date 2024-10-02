import java.util.Scanner;
public class MinimumBitsFlipToConvertANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start:");
		int start=sc.nextInt();
		System.out.println("Enter the goal:");
		int goal=sc.nextInt();
		System.out.println("Minimum Bits Flip:"+minBitFlips(start,goal));
	}
	public static int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int count=0;
        for(int i=0;i<32;i++){
            if((ans&(1<<i))!=0){
                count++;
            }
        }
        return count;
	}
}
