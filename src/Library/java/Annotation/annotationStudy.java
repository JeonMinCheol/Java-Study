package Library.java.Annotation;

/*
    annotation의 정의는 @interface 키워드를 작성한다.

    속성은 타입과 이름으로 구성되며 뒤에 괄호를 붙인다.
    속성의 기본값은 default 값 키워드로 지정한다.
*/

public @interface annotationStudy {
    String prop1();
    int prop2() default 1;
}

/*
    위의 어노테이션은 @annotationStudy(strVal, intVal)로 선언할 수 있다.
    default 값이 있으므로 int는 생략 가능하지만 str은 무조건 써야 한다.


 */