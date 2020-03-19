package cn.antsing.exception;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyExceptionTest {
    MyService myService = new MyService();
    @Test
    public void testWithoutWritableStackTrace(){
        try{
            throw new MyException("没有栈追踪的自定义异常");
        }catch (Exception e){
            Assert.assertTrue("此异常有栈追踪数据",getStackTraceElementLength(e)==0);
        }
    }

    @Test
    public void testWithWritableStackTrace(){
        try{
            myService.insertData(new MyException("有栈追踪的自定义异常",true));
        }catch (Exception e){
            Assert.assertTrue("此异常无栈追踪数据",getStackTraceElementLength(e)>0);
        }
    }

    private int getStackTraceElementLength(Exception e){
        if(e == null){
            return 0;
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        return stackTrace.length;
    }
}