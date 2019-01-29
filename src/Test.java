// Two errors, Rule 10
// https://wiki.sei.cmu.edu/confluence/pages/viewpage.action?pageId=88487735
public class Test{
    public static void main(String[] args){
        Example example = new Example();
        Thread thread = new Thread(example);
        thread.run();
        thread.stop();
    }

    public static class Example implements Runnable{
        @Override
        public void run() {
            //..
        }
    }
}
