import java.util.Scanner;
public class Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and n:");
		int x=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(x+"^"+n+":"+myPow(x,n));
	}
	public static double myPow(int x,int n) {
		long N=n;
        if(N<0){
            N*=-1;
        }
		double ans=1.0;
		while(N>0) {
			if(N%2==0) {
				x*=x;
				N/=2;
			}
			if(N%2==1){
				ans*=x;
				N--;
			}
		}
		if(n>0) {
			return ans;
		}else {
			return 1.0/ans;
		}
	}

}
