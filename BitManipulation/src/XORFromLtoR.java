import java.util.Scanner;
public class XORFromLtoR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr l:");
		int l=sc.nextInt();
		System.out.print("Enter r:");
		int r=sc.nextInt();
		System.out.print("xor from "+l+" to "+r+":"+findXOR(l,r));
	}
	public static int findXOR(int l,int r) {
		return xor(l-1)^xor(r);
	}
	public static int xor(int n) {
		if(n%4==1) {
			return 1;
		}else if(n%4==2) {
			return n+1;
		}else if(n%4==3) {
			return 0;
		}else {
			return n;
		}
	}

}
