// https://insight-bgh.tistory.com/336
package algorithm;

public class Combination {
	static void combination(int depth, int n, int[] arr,int count) {
		if(depth==arr.length) {
			System.out.println(count);
		}
		for(int i=depth; i<arr.length; i+=n) {
			count++;
		}
		combination(depth+1,n,arr,count);
	}
	
	public static void main(String[] args) {
		int depth = 0;
		int n = 2;
		int[] arr = {1,2,3,4};
		int count=0;
		
		combination(depth,n,arr,count);
		// n�� �߿��� a�� �̴� ����� ��
	} // end of main
}
