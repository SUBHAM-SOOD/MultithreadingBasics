package Mutlithreading;

class MyClass01 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 45000) {
            System.out.println("Thread 1 for cooking is running ");
            System.out.println("This makes me happy");
        }

    }

}

class MyClass02 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 45000) {
            System.out.println("Thread 2 for chatting is running");
            System.out.println("THis is amazing");
        }
    }
}

public class Mt_01 {

    public static void main(String[] args) {
        MyClass01 t1 = new MyClass01();
        MyClass02 t2 = new MyClass02();
        t1.start();
        t2.start();
    }
}
