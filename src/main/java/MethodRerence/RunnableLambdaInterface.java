package MethodRerence;// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//

//amorampu


public class RunnableLambdaInterface  {
    public static void main(String[] args) {
        /**
         * Prior to Java8
         */
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Inside Runnable");
            }
        };

        new Thread(runnable).start();

        //Java8 Lanbda

        Runnable runnableLambda = () -> {
            System.out.println("Inside runnable lambda");
        };

        new Thread(runnableLambda).start();

        Runnable runnable1 = () -> System.out.println("New way thread");
        new Thread(runnable1).start();

        new Thread(() ->System.out.println("Last type lambda")).start();
    }

}
