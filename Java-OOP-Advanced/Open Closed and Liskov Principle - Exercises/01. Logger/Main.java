import models.ConsoleAppender;
import models.FileAppender;
import enums.EnumLevels;
import interfaces.Appender;
import interfaces.Layout;
import interfaces.Logger;
import models.SimpleLayout;
import models.XmlLayout;
import models.LogFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(bf.readLine());

        List<Appender> appenderList = new ArrayList<>();
            for (int i = 0; i < nums; i++) {
            String[] tokens = bf.readLine().split("\\s+");
            String appenderType = tokens[0];
            String layoutType = tokens[1];
            String messageType = null;
            if (tokens.length ==3 ){
                messageType = tokens[2];
            }
            Appender appender = null;
            Layout layout = null;

            if (layoutType.equals("SimpleLayout")){
                layout = new SimpleLayout();
            } else if (layoutType.equals("XmlLayout")){
                layout = new XmlLayout();
            }

            if (appenderType.equals("ConsoleAppender")){
                appender = new ConsoleAppender(layout);
            } else if (appenderType.equals("FileAppender")){
                appender = new FileAppender(layout);
            }
            if (tokens.length ==3){
                appender.setEnumLevels(EnumLevels.valueOf(messageType));
            }
            appenderList.add(appender);

        }

        String input = bf.readLine();

        Logger messageLogger = new LogFile.MessageLogger(appenderList);

        while (!"END".equals(input)){
            String[] tokens = input.split("\\|");
            EnumLevels enumLevel = EnumLevels.valueOf(tokens[0]);
            String dateAndTime = tokens[1];
            String message = tokens[2];
            switch (enumLevel){
                case INFO:
                    messageLogger.logInfo(dateAndTime,message);
                    break;
                case WARNING:
                    messageLogger.logWarning(dateAndTime,message);
                    break;
                case ERROR:
                    messageLogger.logError(dateAndTime,message);
                    break;
                case CRITICAL:
                    messageLogger.logCritical(dateAndTime,message);
                    break;
                case FATAL:
                    messageLogger.logFatal(dateAndTime,message);
                    break;
            }

            input = bf.readLine();

        }
        Controller controller = new Controller(messageLogger);
        controller.info();

    }
}
