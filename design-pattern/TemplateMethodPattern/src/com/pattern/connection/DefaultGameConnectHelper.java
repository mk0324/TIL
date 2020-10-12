package com.pattern.connection;

public class DefaultGameConnectHelper extends GameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드");
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디 암호 확인과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        // 서버에서 유저이름 유저의 나이를 알 수 있다.
        // 나이를 확인하고 시간을 확인 -> 성인이 아니고 10시가 지났다면
        // return -1;
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("접속 단계");
        return info;
    }
}
