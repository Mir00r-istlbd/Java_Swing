/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Maverick
 */
public abstract class BaseException extends Exception {

    //private static Logger LOGGER = LoggerUtil.getLogger(LoggerUtil.LogType.CONTROLLER_LOGGER);
    
    private int errorCode;
    private String errorMessage;

    public BaseException(Throwable throwable) {
        super(throwable);
    }

    public BaseException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public BaseException(String string) {
        super(string);
    }

    public BaseException(String message, int errorCode) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = message;
    }


    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        //LOGGER.debug(super.toString());
        return this.errorCode + " : " + this.getErrorMessage();
    }
}