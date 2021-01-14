package Multithreading02;
/*
Data Race Example
* */
class abc7 extends Thread{
    static int garlic = 0 ;
    @Override
    public void run(){
        for(int i = 0 ; i < 1000000 ;i++){
            System.out.println();
            garlic++;
        }
    }
}

public class DataRaceDemo01 {
    public static void main(String[] args) throws InterruptedException {
        abc7 Thread01 = new abc7();
        abc7 Thread02 = new abc7();
        Thread01.start();
        Thread02.start();
        Thread01.join();
        Thread02.join();
        System.out.println("Number of Gralics required are " +abc7.garlic);
    }
}
