package Library.java.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class classObjMain {
    public static void main(String[] args) {
        Class clazz = classObj.class;

        System.out.println("생성자 정보");
        Constructor[] constructors = clazz.getConstructors();

        Arrays.stream(constructors).toList().stream().map(con -> con.getDeclaringClass().getSimpleName()).forEach(System.out::println);

        System.out.println("필드 정보");
        Field[] fields = clazz.getDeclaredFields();
        for(var field : fields){
            System.out.println(field.getType().getName() + " " + field.getName());
        }

        System.out.println("메서드 정보");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(");
            Class[] params = method.getParameterTypes();
            printParams(params);
        }
    }

    static void printParams(Class[] params) {
        Arrays.stream(params).map(p -> p + ", ").forEach(System.out::println);
    }
}
