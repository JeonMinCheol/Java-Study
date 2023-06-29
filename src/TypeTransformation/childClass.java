package TypeTransformation;

public class childClass extends parentClass{
    @Override
    public void method3() {
        System.out.println("child3");
    }

    public static void main(String[] args) {
        childClass cc = new childClass();
        parentClass pc = cc; // 다형성, 자동 타입 변환이 이루어진다.

        pc.method1();
        pc.method2();
        pc.method3(); // 오버라이딩돼서 parent가 아닌 child의 메서드가 호출됨.

        // 객체 instancof 타입: 변수가 참조하는 객체의 타입을 확인할 때 사용

        cc = (childClass) pc; // 강제 타입 변환
                              // 아무때나 할 수 있지 않고 자식 클래스가 부모 클래스로 자동 타입 변환된 후
                              // 다시 자식 타입으로 변환될 때 사용 가능.

    }
}
