package isSubset;

import java.util.Arrays;

public class isSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {14,10,15};
		boolean result = isSubset(arr1,arr2);
		System.out.println(result);

	}

	public static boolean isSubset(int arr1[],int arr2[]) {
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 int i=0;
		 int j=0;
		 
		while (i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr1[i] == arr2[j]) {
				i++;
				j++;
			}else {
				return false;
			}
		}
			
		 return j==arr2.length;
	}
}
//Time complexity: O(N logN + M logM + N+M) since there are two arrays 
//For sorting TC is N logN , two arrays so N and M and for traversing N so N + M
//Space complexity: Array space is depend on the Input so N. For two arrays O(N+M).
