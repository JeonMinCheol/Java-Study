package SingleTon;

public class singleTon {

    private static singleTon singleTonPattern = new singleTon();
    // 앞으로 모든 애플리케이션에선 이 객체만을 접근해서 사용

    private singleTon(){}

    public static singleTon getInstance(){
        return singleTonPattern;
    }
}
