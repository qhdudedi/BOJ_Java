// BufferedReader 버퍼 사
import java.io.*;
import java.util.StringTokenizer;
class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
		// int a, b;
		for (int i=0; i< num; i++){
		    for(int j=0; j< i+1; j++){
		        bw.write("*");    
		    }
		    bw.write("\n");
		   
		}
		br.close();
			
		bw.flush();
		bw.close();
	}
}

// Scanner 사용
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i=0; i <n; i++){
		    for(int j=0; j<i+1; j++){
		        System.out.print("*");
		    }
		    System.out.println("");
		}
	}
}
