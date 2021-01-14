package Multithreading02;

class Ab4 extends  Thread{
    @Override
    public void run(){
        System.out.println("I am thread abc");
    }
}

public class Ll_03 {
    public static void main(String[] args) throws InterruptedException {

        Ab4 th5 = new Ab4();
        th5.setDaemon(true);

        th5.start();
        System.out.println("Is th5 thread a daemon thread "+th5.isDaemon());
     

    }
}

