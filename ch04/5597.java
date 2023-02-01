import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        boolean[] arr = new boolean[31];
	        for(int i=1; i<29; i++){
	            int stu = Integer.parseInt(br.readLine());
	            arr[stu] = true;
	        }
	        for(int i=1; i<arr.length; i++){
	            if(arr[i] != true) System.out.println(i);
	        }
	        br.close();
	}
}
