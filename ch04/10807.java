
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int[] arr = new int[N];
	    
	    
	    for(int i=0; i< arr.length; i++){
	        int num = sc.nextInt();
	        arr[i]= num;
	    }
	    
	    int find = sc.nextInt();
	    int num_cnt=0;
	    for(int i=0; i< arr.length; i++){
	        if(arr[i] == find){
	            num_cnt++;
	        }
	    }
	    System.out.println(num_cnt);
	}
}

/* package BOJ;
import java.io.*;
import java.util.StringTokenizer;

public class b_10807 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    int[] arr = new int[N];
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    
	    for(int i=0; i<= arr.length; i++){
	        arr[i]= Integer.parseInt(st.nextToken());
	    }
	    
	    int find = Integer.parseInt(br.readLine());
	    int num_cnt=0;
	    for(int i=0; i<= arr.length; i++){
	        if(arr[i] == find){
	            num_cnt++;
	        }
	    }
	    System.out.println(num_cnt);
	   
		br.close();
	}
}
*/
