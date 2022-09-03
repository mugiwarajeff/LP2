package main;

public class ContadorLento implements Runnable {
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + i);
        }

        try{
            Thread.currentThread().sleep(2000);
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
