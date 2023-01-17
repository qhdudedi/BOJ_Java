import java.io.*;
import java.util.StringTokenizer;
class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int a, b;
		for (int i=0; i< num; i++){
		    st = new StringTokenizer(br.readLine());
		    a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+(a+b) + "\n");
		}
		br.close();
			
		bw.flush();
		bw.close();
	}
}

/-- for문을 0이 아닌 1부터 시작할 경우 에러가 발생한다 
    문자열을 차례대로 출력해야 하니까 0부터 출력해야 한다?
/
