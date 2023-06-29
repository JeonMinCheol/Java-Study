package NestedClass;

public class memberClass {

    public static void main(String[] args) {
        instanceMemberClassA imca = new instanceMemberClassA();
        instanceMemberClassA.B b = imca.new B();

        staticMemberClassA.B smca = new staticMemberClassA.B();

        localMemberClassA lmca = new localMemberClassA();
        lmca.useB();
    }
}
