package NestedClass;

// 바깥 클래스의 모든 멤버 필드와 메서드 접근 가능.
public class instanceMemberClassA {
    // 인스턴스 멤버 클래스
    // 선언하려면 외부 클래스를 먼저 생성해야 한다.

    private int field = 100;

    private void method(){
        System.out.println("A-method");
    }

    class B {
        int field1 = 1;
        static int field2 = 10; // 내부 클래스의 정적 필드는 자바 17부터 허용

        B(){
            System.out.println("instanceMemberClassA");
        }

        void method1() {
            System.out.println("B.method1");
        }

        static void method2(){
            System.out.println("B.method2");
        }

        // 바깥 클래스 접근
        void method(){
            System.out.println(instanceMemberClassA.this.field);
            instanceMemberClassA.this.method();
        }
    }

    void useB(){
        // 인스턴스 필드, 인스턴스 메서드 사용
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }


    public static void main(String[] args) {
        instanceMemberClassA a = new instanceMemberClassA();

        instanceMemberClassA.B b1 = a.new B();  // 1번, main 메서드도 멤버 메서드로 취급
        a.useB();                               // 2번
    }

}
