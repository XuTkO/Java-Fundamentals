package models;

import enums.EnumLevels;
import interfaces.Layout;

public class SimpleLayout implements Layout {
    private static final String type = "SimpleLayout";


    @Override
    public String getType() {
        return type;
    }

    @Override
    public String formatMessage(String date, EnumLevels enumLevels, String message) {
        return String.format("%s - %s - %s",date,enumLevels,message);
    }
}
