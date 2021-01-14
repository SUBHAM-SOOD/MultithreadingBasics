package Multithreading02;

/*
 *
 Thread.join() method example in JAVA
 */


class Chf_abc extends Thread{
    @Override
    public void run(){
        System.out.println("Thread 02 is started and is in running state...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Ll_01 {
    public static void main(String[] args) throws InterruptedException  {

        Chf_abc th1 = new Chf_abc();
        System.out.println("Starting th01 here");
        th1.start();
        System.out.println("Making th1 thread to sleep");
        Thread.sleep(700);

        System.out.println("Waiting for other thread to get work done");
        th1.join();

        System.out.println("Both done");

    }
}
