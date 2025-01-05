package Pattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         pattern3(5);
	 
}
	public static void printPattern(int n) {
	for(int j=0;j<n;j++) {
		for(int i=0;i<n;i++) {
			System.out.print("* ");
			}
			System.out.println();
			}
	}
	
	public static void printIncreasingStar(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("# ");
			}
			System.out.println();
			
			
		}
		System.out.println();
	}
	public static void printDecreasingStar(int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
	
public static void zohoPattern(String input) {
	 int mid = input.length() / 2;
     String part1 = input.substring(mid);  
     String part2 = input.substring(0, mid);
     String joined = part1+part2;
	 int n = 2*input.length();
	 for(int row=1;row<=input.length();row++) {
		 for(int col = row;col < n ;col++){
				System.out.print(" "); 
		 }
            int temp = mid;
            for ( int k = 1; k <= row; k++) {
                if ( temp < input.length()) {
                    System.out.print(input.charAt(temp));
                    temp++;
                }
                else {
                    temp = 0;
                    System.out.print(input.charAt(temp));
                    temp++;
                }
            }
            System.out.println();
            n-=1;
        }
    }

	 public static void pattern2(int n){
		for(int row=0;row<=n;row++){
			for (char ch = 'A'; ch < 'A' + row; ch++) {
                System.out.print(ch);
            }
				 for (char ch = (char) ('A' + row - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
			System.out.println();
			}
			
		}
	 
	 public static void pattern3(int n){
		System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=17;j++){
				// System.out.print(i+"* ");
				if(j>=1 && j<=8 || j>=10 && j<=17){
					System.out.print("*");
				}
			
				else{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	 }
	}
	














