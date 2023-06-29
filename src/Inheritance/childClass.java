package Inheritance;

// 기본 클래스는 우선 무조건 public이어야 한다.
// 다만, 상속하지 못하게 하려면 final을 class 앞에 붙여준다.
public final class childClass extends parentClass{

    public childClass(String name, boolean check) {
        super(name, check);
    }


    @Override
    public final String getName() {
        return "Hello i'm " + super.getName();
    }

//    final로 지정했기 때문에 오버라이딩 안댐.
//    @Override
//    public final void setName() {
//        System.out.println("NONO");
//    }

    public static void main(String[] args) {
        childClass cc = new childClass("Mincheol", true);
        System.out.println(cc.getName());
        System.out.println(cc.isCheck());

        cc.setName("superMan");
        System.out.println(cc.getName());
    }


}
