package Java_Threads;
public class CreatingThreadclass_RunnableStringname implements runnable
{
public void run()
{    
System.out.println("Now the thread is running ...");
}
public static void main(String args[]){   
Runnable r1 = new CreatingThreadclass_RunnableStringname();  // creating an object of the class MyThread2   
Thread th1 = new Thread(r1, "My new thread");// creating an object of the class Thread using Thread(Runnable r, String name)   
th1.start();   // the start() method moves the thread to the active state
String str = th1.getName();// getting the thread name by invoking the getName() method    
System.out.println(str);  
}    
}


