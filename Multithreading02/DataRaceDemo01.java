package Multithreading02;
import java.util.concurrent.locks.*;
/*
Data Race Example
* */
class Shopper extends Thread{
    static int garlicCount = 0 ;
    static Lock pencil = new ReentrantLock();
    @Override
    public void run(){
        pencil.lock();
        for(int i = 0 ; i < 1000000 ;i++)
            garlicCount++;
            pencil.unlock();
        }
    }


public class DataRaceDemo01 {
    public static void main(String[] args) throws InterruptedException {
        Shopper Thread01 = new Shopper();
        Shopper Thread02 = new Shopper();
        Thread01.start();
        Thread02.start();
        Thread01.join();
        Thread02.join();
        System.out.println("Number of Garlics required are " +Shopper.garlicCount);
    }
}
