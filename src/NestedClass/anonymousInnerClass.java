package NestedClass;

public class anonymousInnerClass {
    public interface a {
        void talk();
    }

    public static void main(String[] args) {

        // 익명 구현 객체
        // new 인터페이스() { }
        a a = new a() {
            @Override
            public void talk() {
                System.out.println("Hi");
            }
        };

        a.talk();

    }
}
