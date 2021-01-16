package Multithreading02;
import java.util.concurrent.atomic.*;

class Shopper01 extends Thread{
    static AtomicInteger garlicCount = new AtomicInteger(0) ;
    @Override
    public void run(){
        for(int i = 0 ; i < 1000000 ;i++)
            garlicCount.incrementAndGet();
    }
}
public class DeathRaceUsingAtomic {
    public static void main(String[] args) throws InterruptedException {
        Shopper01 Thread0001 = new Shopper01();
        Shopper01 Thread0002 = new Shopper01();
        Thread0001.start();
        Thread0002.start();
        Thread0001.join();
        Thread0002.join();
        System.out.println("Number of Garlics required are " +Shopper01.garlicCount);
    }
}
