package array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		System.out.print("Enter size of M: ");
		int m = num1.nextInt();	
		int n = 0;
		int multi[][] = new int[m][];
		
		//Giving the size to columns in jagged Array
		for(int i=0;i<m;i++) {
			System.out.print("Enter size of N for "+i+" row :");
			n = num1.nextInt();	
			multi[i] = new int[n];//for each and every row in an array we are giving different size	
		}
		
		for(int i=0;i<multi.length;i++) {
			for(int j=0;j<multi[i].length;j++) {
				int rand =(int)(Math.random()*100);
				multi[i][j]=rand;
				System.out.println("Index "+ i+","+j+" is: "+multi[i][j]);
			}
		}
		//Enhanced Loop
		System.out.println();
		for(int a[] : multi) {
			for(int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
