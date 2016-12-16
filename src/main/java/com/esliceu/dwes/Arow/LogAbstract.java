package com.esliceu.dwes.Arow;

public abstract class LogAbstract implements Log{

    private static Log LOG = null;
    private boolean logInfo;
    private boolean logWarn;
    private boolean logError;

    protected final String INFO_PREFIX = "INFO ";
    protected final String WARN_PREFIX = "WARN ";
    protected final String ERROR_PREFIX = "WARN ";

    public boolean isLogInfo() {
        return logInfo;
    }

    public void setLogInfo(boolean logInfo) {
        this.logInfo = logInfo;
    }

    public boolean isLogWarn() {
        return logWarn;
    }

    public void setLogWarn(boolean logWarn) {
        this.logWarn = logWarn;
    }

    public boolean isLogError() {
        return logError;
    }

    public void setLogError(boolean logError) {
        this.logError = logError;
    }

    private synchronized static void createInstance(){
        if (LOG == null){
            LOG = new LogFile();
        }
    }

    public static Log getInstance(){
        createInstance();
        return LOG;
    }
}
