package rightRotation;

public class RightRotation {
	
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		rightRotate(arr,7);

	}
	public static void rightRotate(int arr[], int k) {
		int n = arr.length;
		k = k%n;
		int i,j;
		//reverse last k elements.
		for(i=n-k,j=n-1;i<j;i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}	
		//reverse first n-k elements
		for(i=0,j= n-k-1;i<j;i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		//reverse entire array
		for(i=0,j=n-1;i<j;i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int t=0;t<n;t++) {
			System.out.printf( arr[t]+ ",");
		}	
	}
}
//Time complexity: O(N)
//Space complexity: O(1)
