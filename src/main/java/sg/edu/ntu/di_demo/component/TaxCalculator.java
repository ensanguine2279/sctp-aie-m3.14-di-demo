package sg.edu.ntu.di_demo.component;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {
    public String calculate() {
        return "Tax calculated at 9% GST";
    }
}
