package interfaces;

import enums.EnumLevels;

public interface Appender {

    String getType();

    int getMessageApended();

    void setEnumLevels(EnumLevels enumLevels);

    void append(String date, EnumLevels enumLevels, String message);
}
