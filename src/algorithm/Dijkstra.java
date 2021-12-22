// https://gomgomkim.tistory.com/19
package algorithm;

class Graph{ 
	private int n;
	private int maps[][];
	
	public Graph(int n){
		this.n = n; 
		maps = new int[n][n]; 
		
		for(int i=0; i<n; ++i){
			for(int j=0; j<n; ++j){
				maps[i][j] = Integer.MAX_VALUE; 
				} 
			} 
		} // end of public Graph
	
	public void input(int i,int j,int w){
		maps[i][j] = w; maps[j][i] = w; 
		} // end of public input
	
	public void dijkstra(int v){
		int distance[] = new int[n]; 
		boolean[] check = new boolean[n]; 

		for(int i=0; i<n; ++i){
			distance[i] = Integer.MAX_VALUE; 
			} 

		distance[v] = 0; 
		check[v] = true; 

		for(int i=0; i<n; ++i){
			if(distance[i] == 2147483647) System.out.print("�� "); 
			else System.out.print(distance[i]+" "); 
			} 
		System.out.println(""); 
		
		for(int i=0; i<n; ++i){
			if(!check[i] && maps[v][i] != Integer.MAX_VALUE){
				distance[i] = maps[v][i]; 
				} 
			} 

		for(int i=0; i<n; ++i){
			if(distance[i] == 2147483647) System.out.print("�� "); 
			else System.out.print(distance[i]+" "); 
			} 
		System.out.println(""); 
		
		for(int a=0; a<n-1; ++a){ 
			int min = Integer.MAX_VALUE; 
			int min_index = -1; 
			
			for(int i=0; i<n; ++i){ 
				if(!check[i]){
					if(distance[i] < min){
						min = distance[i]; min_index = i; 
						} 
					} 
				} 
			 
			check[min_index] = true;
			
			for(int i=0; i<n; ++i){ 
				if(!check[i] && maps[min_index][i] != Integer.MAX_VALUE){
					if(distance[min_index] + maps[min_index][i] < distance[i]){
						distance[i] = distance[min_index] + maps[min_index][i]; 
						} 
					} 
				} 
			
			 
			for(int i=0; i<n; ++i){
				if(distance[i] == 2147483647) System.out.print("�� "); 
				else System.out.print(distance[i]+" "); 
				} 
			System.out.println(""); 
			} 
		} // end of public dijkstra
	} // end of class Graph


public class Dijkstra {
	public static void main(String[] args) {
		Graph g = new Graph(6); 
		 
		g.input(0, 1, 7); 
		g.input(0, 2, 9); 
		g.input(0, 5, 14); 
		g.input(1, 2, 10); 
		g.input(1, 3, 15); 
		g.input(2, 3, 11); 
		g.input(2, 5, 2); 
		g.input(3, 4, 6); 
		g.input(4, 5, 9); 
		
		g.dijkstra(0); 

	} // end of main
} // end of Dijkstra class
