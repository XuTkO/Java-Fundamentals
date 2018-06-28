package telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Calling,Browsing{

    public Smartphone() {
    }


    @Override
    public String browsing(String web) {
        if (web.matches(".*\\d+.*")){
         return "Invalid URL!";
        }
        return "Browsing: " + web + "!";
    }

    @Override
    public String calling(String number) {
        if (number.matches("\\d+")) {
            return "Calling... " + number;
        } else {
            return "Invalid number!";
        }
    }
}
