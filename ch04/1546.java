package ch04;
import java.util.*;

public class b_1546 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    double[] arr = new double[n];
	    
	    double max = arr[0];
	    double sum=0;
	    for(int i=0; i<arr.length; i++){
	        arr[i] = s.nextDouble();
	        if(arr[i] > max){
	            max = arr[i];
	        }
	    }
	    for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }
	    double avg = sum /n;
	    System.out.println(avg);
	}

}

package ch04;
import java.io.*;
import java.util.StringTokenizer;
public class b_1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    double[] arr = new double[n];
	    StringTokenizer st = new StringTokenizer(br.readLine()," ");
	    
	    double max = arr[0];
	    double sum=0;
	    for(int i=0; i<arr.length; i++){
	        arr[i] = Double.parseDouble(st.nextToken());
	        if(arr[i] > max){
	            max = arr[i];
	        }
	    }
	    for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }
	    double avg = sum /n;
	    System.out.println(avg);
	}

}
