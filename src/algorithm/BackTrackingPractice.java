package algorithm;

public class BackTrackingPractice {
	public static int sum(int a,int tot) {
		
		if(a==0) {			
			return tot;
		}
		else {
			tot+=a;
			return sum(--a,tot);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(sum(10,0));
	} // end of main
}
