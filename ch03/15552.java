import java.io.*;
import java.util.StringTokenizer;
class Main {
	public static void main(String[] args){ // 예외처리 필수! 또는 throwsIOException해주기
		try{
			// 콘솔에서 입력 받을 경우
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st;
			int a, b;
			for (int i=0; i< num; i++){
			    st = new StringTokenizer(br.readLine());
			    a = Integer.parseInt(st.nextToken());
			    b = Integer.parseInt(st.nextToken());
			    
			    bw.write((a+b) + "\n");
			}
			br.close();
			
			bw.flush();
			bw.close();
			
		
		} catch(IOException e){
		    e.printStackTrace();
		    System.out.println(e.getMessage());
		}
	
	}
}
