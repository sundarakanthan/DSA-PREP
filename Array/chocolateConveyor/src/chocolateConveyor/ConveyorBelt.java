package chocolateConveyor;

public class ConveyorBelt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int packets[] = {4,0,7,6,0,2}; 
		conveyorBelt(packets); 
	}
	public static void conveyorBelt(int packets[]) {
		int count = 0;
		for(int i=0;i<packets.length;i++) {
			if(packets[i]!=0) {
				packets[count++] = packets[i];
			}	
		}
		for(int i=count;i<packets.length;i++) {
			packets[i]=0;
		}
		for(int i=0;i<packets.length;i++) {
			System.out.println(packets[i]);
		}
	}
}
//Time complexity: O(N).
//Space complexity: O(1).
