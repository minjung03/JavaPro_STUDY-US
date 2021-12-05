package Page2;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ThreadTest extends JFrame{
	public static void main(String[] args) {
		ExampleThread th1 = new ExampleThread("1");
		//ExampleThread th2 = new ExampleThread("2");
		try {
			Thread.sleep(6000);
			th1.thread.interrupt();
			//th2.thread.interrupt();
			Thread.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("**Exiting the main Thread**");

		
	}
}
class ExampleThread implements Runnable{
	private String name;
	Thread thread;
	
	ExampleThread(String name){
		this.name = name;

        thread = new Thread(this, name);
//        System.out.println("Created Thread: " + thread);

        thread.start();
	}
	  @Override
	    public void run() {

	        while (!thread.isInterrupted()) {
	            System.out.println(name + " is running");
	        }

	        System.out.println(name + " has been Stopped.");

	    }
	
}
