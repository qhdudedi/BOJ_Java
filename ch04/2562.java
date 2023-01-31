import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int[] arr = new int[10];
		int max =arr[1];
		int num =0;
		for(int i=1; i<arr.length; i++){
		    arr[i] = s.nextInt();
		    if(arr[i] > max){
		        max = arr[i];
		        num = i;
		    }
		}
		System.out.println(max);
		System.out.println(num);
	}
}
