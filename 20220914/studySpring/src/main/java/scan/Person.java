package scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    private String name;
    public String getName() {
        return name;
    }

    @Autowired
    public void setName(@Value("Mr. Smith") String name) {
        this.name = name;
    }
}
