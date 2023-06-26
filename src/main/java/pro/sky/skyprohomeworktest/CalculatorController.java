package pro.sky.skyprohomeworktest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return calculatorService.answerCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public Integer summTask2(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public Integer minusTask3(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public Integer multiplyTask4(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public Integer divideTask5(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.divide(num1, num2);
    }

}
