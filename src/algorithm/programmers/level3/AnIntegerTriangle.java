/* https://programmers.co.kr/learn/courses/30/lessons/43105
위와 같은 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중, 거쳐간 숫자의 합이 가장 큰 경우를 찾아보려고 합니다. 
아래 칸으로 이동할 때는 대각선 방향으로 한 칸 오른쪽 또는 왼쪽으로만 이동 가능합니다. 
예를 들어 3에서는 그 아래칸의 8 또는 1로만 이동이 가능합니다.
*/
package algorithm.programmers.level3;

public class AnIntegerTriangle {
	public static void main(String[] args) {
		
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		int result = 0;
		// ===================================
		for(int i=0; i<triangle.length; i++) {
			for(int j=0; j<triangle[i].length; j++) {
				if(i != 0) {
					if(j != 0 && j != triangle[i].length-1) {
						triangle[i][j] = Math.max(triangle[i][j]+triangle[i-1][j-1], triangle[i][j]+triangle[i-1][j]);
						result = Math.max(result, triangle[i][j]); 
					} else if( j == 0) {
						triangle[i][j] = triangle[i][j]+triangle[i-1][j];
						result = Math.max(result, triangle[i][j]);
					} else if( j == triangle[i].length-1) {
							triangle[i][j] = triangle[i][j]+triangle[i-1][j-1];
							result = Math.max(result, triangle[i][j]);
						}
				}
			} // end of for j
		} // end of for i
		
		// ===================================
		// int result = 30;
		System.out.println(result);
	} // end of main
} // end of class AnIntegerTriangle
