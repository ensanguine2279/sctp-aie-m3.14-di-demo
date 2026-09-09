package sg.edu.ntu.di_demo.component;

import org.springframework.stereotype.Component;

@Component
public class AuditLogger {
    public String log() {
        return "Audit log entry";
    }
}
