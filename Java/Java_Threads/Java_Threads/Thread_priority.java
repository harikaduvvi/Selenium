package Java_Threads;
public class Thread_priority extends Thread { // it represents a number between 1 to 10.
    public void run() {
        System.out.println("running thread name is: " + Thread.currentThread().getName());
        System.out.println("running thread priority is: " + Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {
        Thread_priority T1 = new Thread_priority();
        Thread_priority T2 = new Thread_priority();
        
        T1.setPriority(Thread.MIN_PRIORITY); // 1st it executes maximum priority
        T2.setPriority(Thread.MAX_PRIORITY);

        T1.start();
        T2.start();
}
}