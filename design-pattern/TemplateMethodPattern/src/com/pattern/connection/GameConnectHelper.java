package com.pattern.connection;

public abstract class GameConnectHelper {

    /**
     * 하위클래스에서 재정의를 위해 private 가 아닌 protected 로 정의
     * */
    // 보안 과정
    protected abstract String doSecurity(String string);
    // 인증 과정
    protected abstract boolean authentication(String id, String password);
    // 권한 과정
    protected abstract int authorization(String userName);
    // 접속 과정
    protected abstract String connection(String info);

    // 템플릿 메소드
    public String requestConnection(String encodedInfo) {
        // 보안작업 -> 암호화된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);

        // 반환된 것을 문자열을 통해 아이디, 암호를 할당
        String id = "aaa";
        String password = "bbb";

        // 인증과정
        if(!authentication(id, password)) {
            throw new Error("아이디 비밀번호 불일치");
        }

        // 권한과정
        String userName = "userName";
        int i = authorization(userName);

        switch (i) {
            case -1:// 셧다운
                break;
            case 0: // 게임 매니저
                break;
            case 1: // 유료 회원
                break;
           case 2: // 무료 회원
                break;
            case 3: // 권한 없음
                break;
        }

        return connection(decodedInfo);
    }
}
