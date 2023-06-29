package SingleTon;

public class singleTonMain {
    public static void main(String[] args) {

        // singleTon obj = new singleTon(); <- X

        singleTon obj1 = singleTon.getInstance();
        singleTon obj2 = singleTon.getInstance();

        System.out.println(obj1 == obj2); // true
        // => 같은 객체를 참조하는지 확인.

    }
}
