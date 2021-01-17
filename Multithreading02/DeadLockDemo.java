package Multithreading02;


import java.util.concurrent.locks.*;

class Philosopher extends Thread{
    private Lock firstChopstick , secondChopstick;
    private static  int sushiCount = 500;

    public Philosopher(String name , Lock firstChopstick , Lock secondChopstick){
        this.setName(name);
        this.firstChopstick = firstChopstick;
        this.secondChopstick = secondChopstick;
    }
    public void run(){
        System.out.println("Name of current thread is " +Thread.currentThread().getName());
        while(sushiCount > 0){
            firstChopstick.lock();
            secondChopstick.lock();
            if(sushiCount > 0){
                sushiCount--;
                System.out.println(this.getName() + " took a piece .Sushi remaining " +sushiCount );
            }
                secondChopstick.unlock();
                firstChopstick.unlock();
        }
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        Lock chopstickA = new ReentrantLock();
        Lock chopstickB = new ReentrantLock();
        Lock chopstickC = new ReentrantLock();
        new Philosopher("Barron", chopstickA, chopstickB).start();
        new Philosopher("Olivia", chopstickB, chopstickC).start();
        new Philosopher("Steve", chopstickA, chopstickC).start();

    }
}
