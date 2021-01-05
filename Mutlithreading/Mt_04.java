package Mutlithreading;

import javax.xml.namespace.QName;

class th1 extends Thread {


    public th1(String name) {
        super(name);
    }
        @Override
        public void run () {
            int i = 0;
            while(i<5){
        System.out.println("This is thread 01");
        i++;
        }
    }


}

public class Mt_04  {
    public static void main(String args[]) {
        th1 abc1 = new th1("sood");
        abc1.start();
        abc1.setPriority(2);
        System.out.println("Name of thread is "+abc1.getName());
        System.out.println("id of thread is "+abc1.getId());
        System.out.println("Priority of thread is "+abc1.getPriority());
    }
}
