package tcsShuffleGame;

public class ShuffleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pairs = {
				{3,1},{2,1},{1,2}
		};
		int result = shuffleGame(4,pairs);
		System.out.println(result);
	}
	
	public static int shuffleGame(int n, int[][] pairs) {
		for(int i=0; i<pairs.length;i++) {
				if(pairs[i][0] == n) {
					n = pairs[i][1];
				}
				if(pairs[i][1]==n) {
					n = pairs[i][0];
				}
		}
		return n;
	}

}
