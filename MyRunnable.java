class MyRunnable implements Runnable {
    public void run() {
        // Code à exécuter dans le thread
    }
}

// Création et démarrage d'un nouveau thread en utilisant l'interface Runnable
MyRunnable myRunnable = new MyRunnable();
Thread myThread = new Thread(myRunnable);
myThread.start();
