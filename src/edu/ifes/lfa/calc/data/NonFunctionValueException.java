package edu.ifes.lfa.calc.data;


public class NonFunctionValueException extends RuntimeException {
    
    public NonFunctionValueException() {
        super();
    }
    
    public NonFunctionValueException(String message) {
        super(message);
    }
    
    public NonFunctionValueException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public NonFunctionValueException(String message, Throwable cause, 
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    public NonFunctionValueException(Throwable cause) {
        super(cause);
    }
        
}
