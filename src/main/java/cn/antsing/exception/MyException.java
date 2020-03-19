package cn.antsing.exception;

 /**
  *
  * 描述: 异常栈追踪功能可控制的自定义异常类  <br>
  * @author sunyq <br>
  * 创建时间: 2020.03.19 11:22:16 <br>
  *
  */
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
