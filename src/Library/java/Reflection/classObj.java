package Library.java.Reflection;

public class classObj {
    private static Class clazz1;
    private String hidden = null;

    public classObj() {
        this.clazz1 = String.class;
    }

    public void setClazz1(Class clazz1) {
        this.clazz1 = clazz1;
    }

    //    클래스 객체를 선언하는 방법
//    자료 타입은 Class (맨 앞 대문자)
    public static void main(String[] args) {
        /*
        Class clazz2 = Class.forName("java.lang.String");

        String str = new String();
        Class clazz3 = str.getClass();
         */

        System.out.println("패키지: " + clazz1.getPackageName());
        System.out.println("클래스 간단 이름: " + clazz1.getSimpleName());
        System.out.println("클래스 전체 이름: " + clazz1.getName());

    }
}
