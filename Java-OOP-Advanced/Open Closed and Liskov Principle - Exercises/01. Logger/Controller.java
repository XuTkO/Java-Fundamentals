import interfaces.Appender;
import interfaces.Logger;

import java.util.List;

public class Controller {
    private Logger logger;

    public Controller(Logger logger) {
        this.logger = logger;
    }
    public void info(){
        List<Appender> appenders = this.logger.getAppenders();
        System.out.println("Logger info");
        for (Appender appender : appenders) {
            System.out.println(appender.toString());
        }
    }
}
