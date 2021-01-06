package Mutlithreading;


/*
*
Class Using two threads and using sleep method
*
* */
class Ps_01 extends Thread{
    @Override
        public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }

}

class Ps_02 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}
public class Mt_06 {
    public static void main(String args[]){
        Ps_01 obj1 = new Ps_01();
        Ps_02 obj2 = new Ps_02();
        obj1.start();
        obj2.start();
        try {
            obj1.join(100000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try {
            obj2.join(100000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
