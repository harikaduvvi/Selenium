package Java_Threads;
//1st it prints thread group name then it executes run method then it executes thread
public class Thread_groupClass implements Runnable{
public void run() {
	System.out.println("Current thread name "+Thread.currentThread().getName());

}
public static void main(String[] args) {
	
	Thread_groupClass obj = new Thread_groupClass();
	ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
	Thread t1 = new Thread(tg1, obj, "one");
	t1.start();
	Thread t2 = new Thread(tg1, obj, "one");
	t2.start();
	Thread t3 = new Thread(tg1, obj, "one");
	t3.start();
	System.out.println("Thread Group Name:" +t1.getName());
}
}