package rockSample;

public class RockSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {345, 604, 321, 433, 704, 470, 808, 718, 517, 811};
		int ranges[][]= {{300, 380}, {400, 700}};
		
		rockSample(ranges,arr);
 		
	}
	public static void rockSample(int ranges[][],int arr[]) {
	
		for(int i=0;i<ranges.length;i++) {
			int count = 0;
			int range1 = ranges[i][0];
			int range2 = ranges[i][1];
			
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>=range1 && arr[j]<=range2) {
					count++;
				}
				
			}
			System.out.println(count);
		}
		
	}

}
//Time complexity: O(N2).
//Space complexity: O(1).