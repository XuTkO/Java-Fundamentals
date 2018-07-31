package models;

import enums.EnumLevels;
import interfaces.Appender;
import interfaces.Layout;

public class ConsoleAppender implements Appender {
    private static final String type = "ConsoleAppender";

    private Layout layout;
    private EnumLevels enumLevels;
    private int messageApended;


    public ConsoleAppender(Layout layout) {
        this.layout = layout;
        this.enumLevels = EnumLevels.INFO;
        this.messageApended = 0;
    }
    @Override
    public int getMessageApended() {
        return this.messageApended;
    }
    @Override
    public  String getType() {
        return type;
    }
    @Override
    public void setEnumLevels(EnumLevels enumLevels) {
        this.enumLevels = enumLevels;
    }
    @Override
    public void append(String date, EnumLevels enumLevels, String message){
        if (enumLevels.ordinal() >= this.enumLevels.ordinal()){
            String formattedMessage = this.layout.formatMessage(date,enumLevels,message);
            this.messageApended++;
            System.out.println(formattedMessage);
        }
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d",
                this.getType(),this.layout.getType(),this.enumLevels.toString(),this.getMessageApended());
    }
}
