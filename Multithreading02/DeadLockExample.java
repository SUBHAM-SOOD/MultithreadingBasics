package Multithreading02;
/*
Demonstrating Deadlock by calling Join method on Self
* */
public class DeadLockExample {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("We are in "+Thread.currentThread().getName());
        Thread.currentThread().join();
        System.out.println("Done with Thread "+Thread.currentThread().getName());
    }
}
