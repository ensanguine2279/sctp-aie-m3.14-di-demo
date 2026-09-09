package sg.edu.ntu.di_demo.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.ntu.di_demo.component.TaxCalculator;
import sg.edu.ntu.di_demo.component.ShippingCalculator;
import sg.edu.ntu.di_demo.component.DiscountCalculator;
import sg.edu.ntu.di_demo.component.AuditLogger;

@RestController
public class OrderController {

    // private TaxCalculator taxCalculator = new TaxCalculator();
    private TaxCalculator taxCalculator;

    // private ShippingCalculator shippingCalculator = new ShippingCalculator();

    // @Autowired // Field injection
    private ShippingCalculator shippingCalculator;

    private DiscountCalculator discountCalculator;

    private AuditLogger auditLogger;

    private Random random;

    // Constructor injection for ShippingCalculator and DiscountCalculator
    public OrderController(
            ShippingCalculator shippingCalculator,
            DiscountCalculator discountCalculator,
            Random random) {
        this.shippingCalculator = shippingCalculator;
        this.discountCalculator = discountCalculator;
        this.random = random;
    }

    @Autowired // Setter injection for TaxCalculator
    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    @Autowired // Setter injection for AuditLogger
    public void setAuditLogger(AuditLogger auditLogger) {
        this.auditLogger = auditLogger;
    }

    @GetMapping("/tax")
    public String tax() {
        return taxCalculator.calculate();
    }

    @GetMapping("/shipping")
    public String shipping() {
        return shippingCalculator.calculate();
    }

    @GetMapping("/discount")
    public String discount() {
        return discountCalculator.calculate();
    }

    @GetMapping("/audit")
    public String audit() {
        return auditLogger.log();
    }

    @GetMapping("/order-number")
    public String orderNumber() {
        return "Order #" + random.nextInt(10000);
    }
}
