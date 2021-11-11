package Question1;



public class ThreadList implements Runnable {
    ThreadSafeLinkedList newL =  new ThreadSafeLinkedList();


    @Override
    public void run() {
        newL.addAtPosition(0,5);
        newL.addAtPosition(1,8);
        newL.addAtPosition(2,9);
        newL.addAtPosition(3,0);

        newL.removeAtPosition(0,5);
        System.out.println(Thread.currentThread().getName() + " get the first node  " + newL.getFist());
        System.out.println(Thread.currentThread().getName() + " get the last node  " + newL.getLast());
        System.out.println(Thread.currentThread().getName() + " size is " + newL.size());
    }
}
