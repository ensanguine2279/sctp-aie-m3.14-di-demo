package sg.edu.ntu.di_demo.component;

import org.springframework.stereotype.Component;

@Component
public class DiscountCalculator {
    public String calculate() {
        return "Discount calculated at 10% off";
    }
}
