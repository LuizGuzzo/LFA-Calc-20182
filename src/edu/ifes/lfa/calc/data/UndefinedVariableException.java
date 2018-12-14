package edu.ifes.lfa.calc.data;


public class UndefinedVariableException extends RuntimeException {
    
    public UndefinedVariableException() {
        super();
    }
    
    public UndefinedVariableException(String message) {
        super(message);
    }
    
    public UndefinedVariableException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public UndefinedVariableException(String message, Throwable cause, 
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    public UndefinedVariableException(Throwable cause) {
        super(cause);
    }
    
}
