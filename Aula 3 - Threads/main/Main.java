package main;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Contador c1 = new Contador();
        ContadorLento c2 = new ContadorLento();

        Thread t1 = new Thread(c1, "c1");
        Thread t2 = new Thread(c2, "c2");

        //Thread t1 = new MinhaThread();
        //Thread t2 = new MinhaThread();

        //t1.sleep(1000);
        t1.start();
        t2.start();
    }
    
}
