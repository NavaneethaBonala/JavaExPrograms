package threading;

public class ThreadSafeStringBufferExample {
	
	private static StringBuffer stringBuffer = new StringBuffer("Thread data");

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> appendString("Thread 1 "));
        Thread thread2 = new Thread(() -> appendString("Thread 2 "));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String result = stringBuffer.toString();
        System.out.println(result);
    }

    private static void appendString(String text) {
        synchronized (stringBuffer) {
            stringBuffer.append(text);
            System.out.println(stringBuffer);
          
        }
    }

}
