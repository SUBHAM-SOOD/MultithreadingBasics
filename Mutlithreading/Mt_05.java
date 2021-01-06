package Mutlithreading;

import java.sql.SQLOutput;

class Thp_01 extends Thread{

    /*public Thp_01(String name){
        super(name);
    }*/

    @Override
    public void run(){
        int i = 0 ;
        while(i<5){
            System.out.println("Thread is running " +this.getName());
            i++;
            }

    }
}

public class Mt_05 {

    public static void main(String args[]){
        Thp_01 obj001 = new Thp_01();
        Thp_01 obj002 = new Thp_01();
        Thp_01 obj003 = new Thp_01();
        Thp_01 obj004 = new Thp_01();
        Thp_01 obj005 = new Thp_01();
        Thp_01 obj006 = new Thp_01();
        Thp_01 obj007 = new Thp_01();
        Thp_01 obj008 = new Thp_01();
        Thp_01 obj009 = new Thp_01();
        Thp_01 obj010 = new Thp_01();
        obj001.setPriority(Thread.MAX_PRIORITY);
        obj002.setPriority(Thread.MIN_PRIORITY);
        obj003.setPriority(Thread.MIN_PRIORITY);
        obj004.setPriority(Thread.MIN_PRIORITY);
        obj005.setPriority(Thread.MIN_PRIORITY);
        obj006.setPriority(Thread.MIN_PRIORITY);
        obj007.setPriority(Thread.MIN_PRIORITY);
        obj008.setPriority(Thread.MIN_PRIORITY);
        obj009.setPriority(Thread.NORM_PRIORITY);

        obj001.start();
        obj002.start();
        obj003.start();
        obj004.start();
        obj005.start();
        obj006.start();
        obj007.start();
        obj008.start();
        obj009.start();
        obj010.start();

        System.out.println("Thread Priority is : "+obj001.getPriority());
        System.out.println("Thread Priority is : "+obj002.getPriority());
        System.out.println("Thread Priority is : "+obj003.getPriority());
        System.out.println("Thread Priority is : "+obj004.getPriority());
        System.out.println("Thread Priority is : "+obj005.getPriority());
        System.out.println("Thread Priority is : "+obj006.getPriority());
        System.out.println("Thread Priority is : "+obj007.getPriority());
        System.out.println("Thread Priority is : "+obj008.getPriority());
        System.out.println("Thread Priority is : "+obj009.getPriority());
        
    }
}
