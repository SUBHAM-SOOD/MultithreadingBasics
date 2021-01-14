package Mutlithreading;
/*
*
*
**/

class Sp1 extends Thread{
    @Override
    public void run(){
        while(true){
            try{
                System.out.println("\nHi from Sood "+getName());
                System.out.println("Thread state is "+getState());
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Sp2 extends Thread{
    @Override
    public void run(){
        while(true){
            try{
                System.out.println("\nI am from second class "+getName());
                System.out.println("Thread state is "+getState());
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Mt_07 {

    public static void main(String args[]){
        Sp1 nAbc1 = new Sp1();
        Sp2 nAbc2 = new Sp2();
        nAbc1.setPriority(Thread.MAX_PRIORITY);
        nAbc2.setPriority(Thread.MIN_PRIORITY);
        nAbc1.setName("TH01");
        nAbc2.setName("TH02");
        nAbc1.start();
        nAbc2.start();
        System.out.println("Current running Thread is "+Thread.currentThread().getState());
    }
}
