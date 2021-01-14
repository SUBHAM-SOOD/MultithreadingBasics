package Multithreading02;

class abc3 implements  Runnable{
    @Override
    public void  run(){
        System.out.println("This is our thread 02");
          }
}

public class Ll_02 {
    public static void main(String[] args) {
    Thread ab1 = new Thread(new abc3());
    ab1.start();
        System.out.println(ab1.getName());
        System.out.println(ab1.getState());
    }
}
