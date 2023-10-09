package SeleniumProject.SeleniumProject;

public class Solution {
	
	
	
	public static int solution(int[] D, int[] C, int P) {
	    int numObjects = D.length;
	    int numRendered = 0;
	    int totalCost = 0;
	    
	    // Iterate over objects sorted by distance
	    for (int i = 0; i < numObjects; i++) {
	        int idx = i;
	        for (int j = i + 1; j < numObjects; j++) {
	            if (D[j] < D[idx]) {
	                idx = j;
	            }
	        }
	        int tempDist = D[i];
	        D[i] = D[idx];
	        D[idx] = tempDist;
	        
	        int tempCost = C[i];
	        C[i] = C[idx];
	        C[idx] = tempCost;
	        
	        if (totalCost + C[i] <= P) {
	            numRendered++;
	            totalCost += C[i];
	        } else {
	            break;
	        }
	    }
	    
	    return numRendered;
	}
	
	public static void main(String[] args) {
		
		int[] D = {5, 5, 5, 5};
		int[] C = {8, 3, 3, 4};
		int P = 6;
		
		System.out.println(solution(D,C,P));
		
	}

}
