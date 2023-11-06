package array;
import java.lang.Math;  
import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		System.out.print("Enter size of M: ");
		int m = num1.nextInt();	
		System.out.print("Enter size of N: ");
		int n = num1.nextInt();	
		int multi[][] = new int[m][n];
		
		//for spiral
		int i,last_row=m-1,last_col=n-1,row=0,col=0;
		
		for(i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
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
//		
		while(row<=last_row && col<=last_col) 
		{
			/* Print the first row from
            the remaining rows */
			for(i=col;i<=last_col;i++){
				System.out.print(multi[row][i]+" ");
				
			}
			row++;//As first row is printed it should move to next row
			
			 /* Print the last column
	         from the remaining columns */
			for(i=row;i<=last_row ;i++){
				System.out.print(multi[i][last_col]+" ");
				
			}
			last_col--;
			
			/* Print the last row from
            the remaining rows */
			if(row<=last_row){
	    		for(i=last_col;i>=col;i--){
	    			System.out.print(multi[last_row][i]+" ");	
	    		}
	    		last_row--;
			}	
			
			/* Print the first column from
            the remaining columns */
			if(col<=last_col){
	    		for(i=last_row;i>=row;i--)
	    		{
	    			System.out.print(multi[i][col]+" ");
	    		}
	    		col++;
			}
		}
	}
	
	//Similarly we can create Three Dimensional Array
	// int multi[][][] = new int[m][n][o];
}
