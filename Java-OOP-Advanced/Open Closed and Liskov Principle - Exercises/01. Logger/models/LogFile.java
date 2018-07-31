package models;

import enums.EnumLevels;
import interfaces.Appender;
import interfaces.File;
import interfaces.Logger;

import java.util.List;

public class LogFile implements File {
    private StringBuilder stringBuilder;
    private int size;

    public LogFile() {
        this.stringBuilder = new StringBuilder();
        this.size = 0;
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void write(String message){
        this.stringBuilder.append(message).append(System.lineSeparator());

        for (int i = 0; i < message.length(); i++) {
            if (Character.isAlphabetic(message.charAt(i))){
                this.size+=message.charAt(i);
            }
        }
    }

    public static class MessageLogger implements Logger {

        private List<Appender> appenders;


        public MessageLogger(List<Appender> appenders)
        {
            this.appenders = appenders;
        }

        @Override
        public List<Appender> getAppenders() {
            return this.appenders;
        }

        @Override
        public void logInfo(String date,String message) {
            for (Appender appender : appenders) {
                appender.append(date,EnumLevels.INFO,message);
            }
        }

        @Override
        public void logWarning(String date,String message) {
            for (Appender appender : appenders) {
                appender.append(date,EnumLevels.WARNING,message);
            }
        }

        @Override
        public void logError(String date,String message) {
            for (Appender appender : appenders) {
                appender.append(date,EnumLevels.ERROR,message);
            }

        }

        @Override
        public void logCritical(String date,String message) {
            for (Appender appender : appenders) {
                appender.append(date,EnumLevels.CRITICAL,message);
            }
        }

        @Override
        public void logFatal(String date,String message) {
            for (Appender appender : appenders) {
                appender.append(date,EnumLevels.FATAL,message);
            }
        }
    }
}
