package sg.edu.ntu.di_demo.component;

import org.springframework.stereotype.Component;

@Component
public class ShippingCalculator {
    public String calculate() {
        return "Shipping calculated at $4.50 flat rate";
    }
}
