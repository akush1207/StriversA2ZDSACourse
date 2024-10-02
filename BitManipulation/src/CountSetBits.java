import java.util.Scanner;
public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numer:");
		int num=sc.nextInt();
		System.out.println("No. of set bits:"+countSetBits(num));
	}
	public static int countSetBits(int num) {
		int count=0;
		while(num!=0) {
			if((num&1)==1){
				count++;
			}
			num>>=1;
		}
		return count;
	}

}
