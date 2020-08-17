package com.sboo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;

public class LogWriter {
    private static LogWriter singleton = new LogWriter();
    private static BufferedWriter bw;

    private LogWriter() {
        try {
            bw = new BufferedWriter(new FileWriter("log.txt"));
        }catch (Exception e){}
    }

    public static LogWriter getInstance() {
        return singleton;
    }

    //synchronized 처리 안하면 아마 파일 write가 중구난방으로 될듯?
    //파일이 깨질수도?
    public synchronized void log(String str) {
        try {
//            bw.write(LocalDateTime.now() + ":" + str + "\n");
            bw.write(str + "\n");
            bw.flush();
        }
        catch (Exception e) {
//            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() {
        try {
            super.finalize();
            bw.close();
        }catch (Throwable ex) {}
    }
}
