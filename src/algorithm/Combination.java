// https://insight-bgh.tistory.com/336
package algorithm;

public class Combination {
	static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
		if(r==0) {
			print(arr,visited,n);
			return;
		}
		for(int i=start; i<n; i++) {
			visited[i]=true;
			combination(arr,visited,i+1,n,r-1);
			visited[i]=false;
		}
	} // end of static combination
	
	static void print(int[] arr, boolean[] visited, int n) {
		for(int i=0; i<n; i++) {
			if(visited[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	} // end of print
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int n = arr.length;
		boolean[] visited = new boolean[n];
		int r = 2;
		
			System.out.println("%s개 중에서 %s개 뽑기".formatted(n,r));
			combination(arr,visited,0,n,r);
	} // end of main
}
