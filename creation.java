package array;
import java.lang.Math;  
import java.util.Scanner; 

public class creation {

	public static void main(String[] args) {
		//int num1[] = {1,2,3,4};
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter size of Array: ");
	    int num = sc.nextInt();		 
	    int arr[] = new int[num];
		//Giving values to array by generating random number and printing
		for(int i=0;i<arr.length;i++) {
			int rand =(int)(Math.random()*100);
			arr[i]=rand;
			System.out.println("Index "+ i+" is: "+arr[i]);
		}

	}

}
