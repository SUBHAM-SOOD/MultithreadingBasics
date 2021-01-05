package Mutlithreading;

class Mt_01_eg1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("This is from our class implementing Runnable inteface "+i);
            i++;
        }
    }
}
public class Mt_03  {
    public static void main(String args[]){
        //Mt_01_eg1 obj1 = new Mt_01_eg1();
        Thread abc1 = new Thread(new ThreadGroup("Thread group01") , new Mt_01_eg1() , "Dude Thread");
        abc1.start();
        System.out.println("Name of thread is "+abc1.getName());
        System.out.println("Name of thread is "+abc1.getThreadGroup().getName());
        System.out.println("Priority of thread is "+abc1.getPriority());
    }
}
