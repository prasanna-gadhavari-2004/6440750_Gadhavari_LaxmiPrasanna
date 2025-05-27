import java.lang.reflect.Method;

class Sample {
    public void sayHello() {
        System.out.println("Hello from Sample!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Sample");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
            m.invoke(obj);
        }
    }
}