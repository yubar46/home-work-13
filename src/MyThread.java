public class MyThread extends Thread {

    public void run(){
        while (true){
            System.out.println("hello");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){

                System.out.println("interrupted");

                    break;
            }
        }
    }
}
