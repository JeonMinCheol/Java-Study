package Library.java;

public class baseModuleMain {
    public static void main(String[] args) {

        // equals 오버라이딩
        baseModule b1 = new baseModule("superman", 0);
        baseModule b2 = new baseModule("superman", 1);
        baseModule b3 = new baseModule("supergirl", 2);

        System.out.println(b1.equals(b2)); // true: superman == superman
        System.out.println(b2.equals(b3)); // false: superman != supergirl


        // hashCode 오버라이딩
        baseModule b4 = new baseModule("superman",0);

        System.out.println(b1.hashCode() == b4.hashCode());
        System.out.println(b1.hashCode() == b2.hashCode());


        // toString 오버라이딩
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }
}
