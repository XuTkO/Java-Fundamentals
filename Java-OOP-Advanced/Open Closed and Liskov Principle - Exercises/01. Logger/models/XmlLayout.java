package models;

import enums.EnumLevels;
import interfaces.Layout;

public class XmlLayout implements Layout {
    private static final String type = "XmlLayout";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String formatMessage(String date, EnumLevels enumLevels, String message) {
        StringBuilder sb = new StringBuilder();
        sb.append("<log>").append(System.lineSeparator())
                .append("   <date>").append(date).append("</date>").append(System.lineSeparator())
                .append("   <level>").append(enumLevels).append("</level>").append(System.lineSeparator())
                .append("   <message>").append(message).append("</message>").append(System.lineSeparator())
                .append("</log>");

        return sb.toString();
    }
}
