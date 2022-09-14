package scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
    @Autowired
    private Person person;

    public void sayHello() {
        System.out.printf("Hello\n", (person != null ? person.getName() : "Someone"));
    }
}
