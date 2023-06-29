package NestedClass;

// 생성자 또는 메소드 내부에서 선언된 클래스
public class localMemberClassA {
    localMemberClassA(){
        class B {
            B() {
                System.out.println("localMemberClassA");
            }
        }

        B b = new B();
    }

    void useB() {
        class B {
            B() {
                System.out.println("localMemberClassA");
            }
        }

        B b = new B();
    }

}
