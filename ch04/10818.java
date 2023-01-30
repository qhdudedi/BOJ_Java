import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i< num; i++){
		    arr[i] = s.nextInt();
		}
		int max = arr[0];
		for(int i=0; i< num; i++){
		    if(arr[i] > max){
		        max = arr[i];
		    }
	    }
	    int min = arr[0];
	    for(int i=0; i<num; i++){
	        if(arr[i] < min){
	            min = arr[i];
	        }
	    }
	    System.out.print(min+" "+max);
    }
}
