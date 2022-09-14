package Calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration3 {
    @Bean
    public Machine machine() {
        Machine machine = new Machine();
        machine.setCalculator(calculatorSub());
        return machine;
    }
    @Bean
    public Calculator calculator() {
        return new Adder();
    }

    @Bean
    public Calculator calculatorSub() {
        return new Subtractor();
    }
}
