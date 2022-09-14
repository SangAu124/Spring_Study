package Calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application4 {

    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration3.class);
//
//        Machine machine = context.getBean("machine", Machine.class);
//        machine.execute();

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigurationCalculator.class);
        Machine machine = context.getBean("machine", Machine.class);
        machine.execute();

    }

}