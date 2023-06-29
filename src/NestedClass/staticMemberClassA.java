package NestedClass;

// static member class는 바깥 클래스의 정적 필드와 정적 메서드만 사용 가능.
public class staticMemberClassA {

    int field = 100;

    void method(){
        System.out.println("A-method");
    }

    public static class B {

        B(){
            System.out.println("staticMemberClassA");
        }

        void method1() {
            System.out.println("B.method1");
        }

        static void method2(){
            System.out.println("B.method2");
        }
    }

    public static void main(String[] args) {

    }
}
