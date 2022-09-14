package Main;

import com.study.spring.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigurationMain.class);
        Hello hello = context.getBean("hello", Hello.class);
        hello.sayHello();
    }
}
