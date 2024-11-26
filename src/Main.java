public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        try{
            //Su dung join de dam bao OddThread chay xong truoc khi Even Thread bat dau
            oddThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //
        evenThread.start();
    }
}