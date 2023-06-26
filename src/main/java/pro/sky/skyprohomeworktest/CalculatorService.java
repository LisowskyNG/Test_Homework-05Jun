package pro.sky.skyprohomeworktest;

import ch.qos.logback.core.joran.conditional.IfAction;
import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public String  answerCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer  minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }

}
