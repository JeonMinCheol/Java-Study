package Inheritance;

public class parentClass {
    public String name; // public : 날 가져요
    protected String gender; // protected : 같은 패키지이거나 자식 클래스는 사용 가능
    int age; // default : 같은 패키지는 사용 가능
    private boolean check; // private : 같은 클래스는 사용 가능

    // default constructor
    parentClass(String name, boolean check){ // 부모 생성자가 private라면 자식 클래스는 super 사용 X
        this.name = name;                    // -> 즉, 상속 X.
        this.check = check;
        this.gender = "Male";
        this.age = 23;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
    // 이 메서드는 오버라이딩 할 수 없다.

    public boolean isCheck() { // boolean은 접두사로 is가 붙음.
        return check;
    }

    private void setCheck(boolean check) {
        this.check = check;
    }

    protected String getGender() {
        return gender;
    }

    protected void setGender(String gender) {
        this.gender = gender;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }
}
