import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int M =Integer.parseInt(st.nextToken());
		int tmp;
		for(int i=0; i<arr.length; i++) { // 바구니가 1부터 시작
			arr[i] = i+1;
		}
		
		for(int j=0; j<M; j++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			
			tmp = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = tmp;
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
