import java.util.Scanner;
public class DivideTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the divisor:");
		int divisor=sc.nextInt();
		System.out.println("Enter the dividend:");
		int dividend=sc.nextInt();
		System.out.println("Quotient:"+quotient(divisor,dividend));
	}
	public static int quotient(int divisor,int dividend) {
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
		boolean sign=(dividend<0)^(divisor<0);
		long d=Math.abs((long)divisor);
		long n=Math.abs((long)dividend);
		int count=0;
		while(n>=d) {
            long temp=d;
			int multiple=1;
			while(n>=(temp<<1)) {
				temp<<=1;
                multiple<<=1;
			}
            n-=temp;
			count+=multiple;
		}
        return sign? -count:count;
	}

}
