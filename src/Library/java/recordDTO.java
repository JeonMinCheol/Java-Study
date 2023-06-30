package Library.java;

/*

 record를 컴파일하면 자동으로 변수 타입과 이름을 이용해서 private final 필드가 자동 생성되고
 생성자 및 getter 메서드가 자동으로 추가된다.
 그리고 hashCode(), toString(), equals()를 재정의한 코드가 자동으로 추가된다.

 */

public record recordDTO (String name, String id, int age){
}
