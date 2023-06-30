package Library.java;

/*

 class를 생성할 시 extends로 따로 다른 클래스를 상속하지 않는다면 object 클래스를 상속한다.
 object 클래스는 자바의 모든 클래스의 조상, 부모 클래스이다.

 object 클래스의 주요 메서드
 1. boolean equals(object obj)
 = 객체의 번지를 비교하고 결과를 리턴

 2. int hashCode()
 = 객체의 해시코드를 반환

 3. String toString()
 = 객체 문자 정보를 리턴

*/

public class baseModule {

    // String, Integer, Long , etc. 모두 기본 타입이 아닌 레퍼 클래스
    // 값을 보관하지 않고 값을 갖는 객체의 주소를 값으로 갖음.
    // 클래스여서 여러 메서드를 사용 가능. ex) 모든 클래스는 object의 메서드를 사용 가능하므로 레퍼 클래스도 이를 사용 가능.

    private final String name;
    private final Integer id;


    public baseModule(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        // obj가 baseModule을 상속받는다면 true
        if(obj instanceof baseModule target) {

            // obj가 baseModule 타입인지 검사 후 타입 변환 후 target에 대입
            // baseModule target = (baseModule) obj;

            // 입력받은 클래스가 baseModule이고 현재 클래스와 입력 클래스의 name이 같은 경우에만 true

            if(this.name.equals(target.name))
                return true;

        }

        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode() + name.hashCode();
    }


    @Override
    public String toString() {
        return this.name;
    }
}
