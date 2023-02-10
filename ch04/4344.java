package ch04;
import java.io.*;
import java.util.StringTokenizer;

public class b_4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i < num; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int stu = Integer.parseInt(st.nextToken());
			double[]arr = new double[stu];
			
			double sum = 0;
			for(int j=0; j < stu; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			double mean = (sum / stu);
			double cnt = 0;
			for (int j = 0; j<stu; j++) {
				if(arr[j] > mean) cnt++;
			}
			System.out.printf("%.3f%%\n", (cnt/stu)*100);
		}
	}

}
