package Library.java;

public class recordMain {

    public static void main(String[] args) {
        recordDTO r1 = new recordDTO("name", "id", 100);

        System.out.println(r1.name()); // private 이지만 record를 사용하면 getter 메서드를 호출.
        System.out.println(r1.id());
        System.out.println(r1.age());
        System.out.println(r1.toString());


        recordDTO r2 = new recordDTO("wint3r", "눈송이", 25);
        recordDTO r3 = new recordDTO("winter", "눈송이", 25);

        System.out.println("r2.hashCode() = " + r2.hashCode());
        System.out.println("r3.hashCode() = " + r3.hashCode());
        System.out.println("r2.equals(r3) = " + r2.equals(r3));

    }

}
