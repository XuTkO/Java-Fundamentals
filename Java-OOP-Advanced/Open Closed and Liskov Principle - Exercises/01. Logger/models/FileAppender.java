package models;

import enums.EnumLevels;
import interfaces.Appender;
import interfaces.File;
import interfaces.Layout;

public class FileAppender implements Appender {
    private static final String type = "FileAppender";

    private Layout layout;
    private File file;
    private EnumLevels enumLevels;
    private int messageApended;


    public FileAppender(Layout layout) {
        this.layout = layout;
        this.file = new LogFile();
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
            this.file.write(formattedMessage);
        }
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d, ile size: %d",
                this.getType(),this.layout.getType(),this.enumLevels.toString(),this.getMessageApended(),this.file.getSize());
    }
}
