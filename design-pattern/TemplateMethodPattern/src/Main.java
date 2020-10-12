import com.pattern.connection.DefaultGameConnectHelper;
import com.pattern.connection.GameConnectHelper;

public class Main {
    public static void main(String[] args) {
        GameConnectHelper helper = new DefaultGameConnectHelper();

        helper.requestConnection("아이디 암호 등 접속 정보");
    }
}
