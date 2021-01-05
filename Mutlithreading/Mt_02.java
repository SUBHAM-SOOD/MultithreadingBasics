package Mutlithreading;
/*
*
*
* */
class MultithreadingUsingInterface01 implements Runnable {
    @Override
    public void run(){
        int i = 0;
        while( i < 10){
            System.out.println("This is thread 01");
            i++;
        }
    }
}
class MultithreadingUsingInterface02 implements Runnable{
    @Override
    public void run() {
        int i = 0 ;
        while (i < 10) {
            System.out.println("This is from thread 02");
            i++;
        }
    }
}
public class Mt_02 {
    public static  void main(String args[]) {
        MultithreadingUsingInterface01 Bullet01 = new MultithreadingUsingInterface01();
        Thread Gun01 = new Thread(Bullet01);
        MultithreadingUsingInterface02 Bullet02 = new MultithreadingUsingInterface02();
        Thread Gun02 = new Thread(Bullet02);
        Gun01.start();
        Gun02.start();
        System.out.println("Id of Gun01 thread is " +Gun01.getId());
        System.out.println("Id of Gun01 thread is " +Gun02.getId());
    }
}