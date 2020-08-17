package com.sboo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        LogWriter logger;
//
//        logger = LogWriter.getInstance();
//        logger.log("홍길동");
//
//        logger = LogWriter.getInstance();
//        logger.log("전우치");

        for(int i = 0; i < 50; i++) {
            Thread t = new ThreadSub(i);
            t.start();
        }
    }
}

class ThreadSub extends Thread {
    int num;

    public ThreadSub(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        LogWriter logger = LogWriter.getInstance();
        if(num < 10){
            logger.log("*** 0" + num + " ***");
        }
        else {
            logger.log("*** " + num + " ***");
        }
    }
}
