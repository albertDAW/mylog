package com.esliceu.dwes.Arow;

public interface Log {
    void logInfo(String textToLog);
    void setLogInfo(boolean logInfo);
    void logWarn(String textToLog);
    void setLogWarn(boolean logWarn);
    void logError(String textToLog);
    void setLogError(boolean logError);
}
