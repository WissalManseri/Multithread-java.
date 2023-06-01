public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class Main {
    public static void main(String[] args) {
        // Création de plusieurs threads
        for (int i = 0; i < 5; i++) {
            MyThread thread = new MyThread();
            thread.start(); // Lancement du thread
        }
    }
}
