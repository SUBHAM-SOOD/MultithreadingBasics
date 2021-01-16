package Multithreading02;

class ShopperOne extends Thread{
    static int garlicCount = 0 ;

    private static synchronized void addGarlic(){
        garlicCount++;
    }
    @Override
    public void run(){
        for(int i = 0 ; i <100000 ; i++)
            addGarlic();
    }
}

public class DeathRaceUsingSynchronizedKeyword {
    public static void main(String[] args) throws InterruptedException {

        ShopperOne ab1 = new ShopperOne();
        ShopperOne ab2 = new ShopperOne();
        ab1.start();
        ab2.start();
        ab1.join();
        ab2.join();

        System.out.println("We need in total " +ShopperOne.garlicCount+ " garlics");


    }
}
