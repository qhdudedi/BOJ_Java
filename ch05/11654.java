import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int cd = System.in.read();
        System.out.println(cd);
    }
}
// System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키 코드 값 저장 가능
// ** 예외처리를 필수로 해줘야 함
