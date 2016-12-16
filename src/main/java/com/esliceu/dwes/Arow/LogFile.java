package com.esliceu.dwes.Arow;

import java.io.*;

public class LogFile extends LogAbstract {

    public void logInfo(String textToLog) {
        if (isLogInfo()) {
            writeFile(INFO_PREFIX + textToLog);
        }
    }

    public void logWarn(String textToLog) {
        if (isLogWarn()) {
            writeFile(WARN_PREFIX + textToLog);
        }
    }

    public void logError(String textToLog) {
        if (isLogError()) {
            writeFile(ERROR_PREFIX + textToLog);
        }
    }

    private void writeFile(String text) {
        BufferedWriter writer;

        try {
            writer = new BufferedWriter(new FileWriter("log.log" , true
            ));
            writer.append(text);
            writer.newLine();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
