package interfaces;

import enums.EnumLevels;

public interface Layout {

    String getType();
    String formatMessage(String date, EnumLevels enumLevels, String message);
}
