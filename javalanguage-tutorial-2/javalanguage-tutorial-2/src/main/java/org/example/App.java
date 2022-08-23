package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Printer printerA = new Printer("프린터A");
        Printer printerB = new Printer("프린터B");
        Printer printerC = new Printer("프린터C");

//        printerA.setPriority(Thread.MAX_PRIORITY);
//        printerB.setPriority(Thread.NORM_PRIORITY);
//        printerC.setPriority(Thread.MIN_PRIORITY);

        printerA.start();
        printerB.start();
        printerC.start();
    }
}
