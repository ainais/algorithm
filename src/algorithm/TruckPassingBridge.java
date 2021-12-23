// https://programmers.co.kr/learn/courses/30/lessons/42583
/*
 문제 설명
트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다. 
모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 
다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다. 
단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.

예를 들어, 트럭 2대가 올라갈 수 있고 무게를 10kg까지 견디는 다리가 있습니다. 
무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.

경과 시간	다리를지난트럭	다리를건너는트럭	    대기트럭
0	     []	            []	        [7,4,5,6]
1~2	     []	            [7]	        [4,5,6]
3	     [7]	        [4]	        [5,6]
4	     [7]	        [4,5]	    [6]
5	     [7,4]	        [5]	        [6]
6~7	     [7,4,5]	    [6]	        []
8	     [7,4,5,6]	    []	        []
따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.

solution 함수의 매개변수로 다리에 올라갈 수 있는 트럭 수 bridge_length, 
다리가 견딜 수 있는 무게 weight, 
트럭 별 무게 truck_weights가 주어집니다. 
이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.

입출력 예
bridge_length	weight	truck_weights						return
2				10		[7,4,5,6]							8
100				100		[10]								101
100				100		[10,10,10,10,10,10,10,10,10,10]		110
 */
package algorithm;

import java.util.LinkedList;
import java.util.Queue;


public class TruckPassingBridge {
	public static void solution(int bridge_length,int weight,int[] truck_weights) {
		Queue<Integer> q = new LinkedList<>();
		int current_weight=0;
		int ans = 0;
		for(int i=0; i<truck_weights.length; i++) {
			
			while(true) {
			if(current_weight+truck_weights[i]<=weight) {
				current_weight+=truck_weights[i];
				q.add(truck_weights[i]);
				ans++;
				break;
			}
			else if(q.size()==bridge_length) {
				current_weight-=q.poll();
				ans++;
				break;
			}
			else {
				q.add(0);
			}
			
			} // end of while true
		} // end of for
		
		System.out.println(ans+bridge_length);
	} // end of solution
	public static void main(String[] args) {		
		//int bridge_length=2;
		int bridge_length=100;
		//int weight=10;
		int weight=100;
		//int[] truck_weights= {7,4,5,6};
		int[] truck_weights= {10,10,10,10,10,10,10,10,10,10};
		
		solution(bridge_length,weight,truck_weights);
	}
}
