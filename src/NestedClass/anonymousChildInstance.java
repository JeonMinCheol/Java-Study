package NestedClass;

public class anonymousChildInstance {
    void talk(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {

        anonymousChildInstance ac1 = new anonymousChildInstance();

        // 익명 자식 객체
        // new 부모클래스() { }
        anonymousChildInstance ac2 = new anonymousChildInstance() {
            @Override
            void talk() {
                System.out.println("Bye");
            }
        };

        System.out.print("ac1: ");
        ac1.talk();

        System.out.print("ac2: ");
        ac2.talk();
    }
}
