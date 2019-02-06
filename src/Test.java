// Two errors, Rule 10
// https://wiki.sei.cmu.edu/confluence/pages/viewpage.action?pageId=88487735
public class Test{
    public static void main(String[] args) throws InterruptedException {
        Example example = new Example();
        Thread thread = new Thread(example);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
    }

    public static class Example implements Runnable{
        @Override
        public void run() {
            //..
        }
    }
}
