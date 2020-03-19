package cn.antsing.exception;

public class MyException extends RuntimeException{
    /**
     * 异常栈追踪不可写的构造函数
     * @param message
     */
    MyException(String message){
        this(message,false);
    }

    /**
     * 异常栈追踪可自定义的构造函数
     * @param message
     * @param writableStackTrace
     */
    MyException(String message,boolean writableStackTrace){
        this(message,null,true,writableStackTrace);
    }
    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
