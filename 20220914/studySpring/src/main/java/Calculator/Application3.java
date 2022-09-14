package Calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application3 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application3-context.xml");

        Machine machine = context.getBean("machine", Machine.class);
        machine.execute();
    }

}
