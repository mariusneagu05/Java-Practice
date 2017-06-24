/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumer.producer;

/**
 *
 * @author MariusNeagu
 */
class Consumer extends Thread {

    private Product prod;

    public Consumer(Product prod) {
        this.prod = prod;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = prod.get();

            try {
                sleep(1 + (int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}

class Producer extends Thread {

    private Product prod;

    public Producer(Product prod) {
        this.prod = prod;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            prod.set(i);

            try {
                sleep(1 + (int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}

class Product {

    private int value;
    private boolean available;		// daca sunt produse in container

    Product() {
        value = -1;
        available = false;
    }

    public boolean empty() {
        return !available;
    }

    public synchronized int get() {				// consuma produs
        while (available == false) {
            try {
                Thread.currentThread().sleep(5);
                //wait(5000);
            } catch (Exception ex) {
                System.err.println("error sleeping");
            }
        }

        available = false;
        System.out.println("am consumat produsul " + value);
        //notifyAll();
        return value;
    }

    public synchronized void set(int val) { 	// produce produs
        while (available == true) {
            try {
                Thread.currentThread().sleep(6);
                //wait(6000);
            } catch (Exception ex) {
                System.err.println("error sleeping");
            }
        }

        available = true;
        value = val;
        System.out.println("am produs " + val);
        //notifyAll(); 
    }
}

public class Thrsynchr {

    public static void main(String args[]) {
        Product prod = new Product();
        Consumer c = new Consumer(prod);
        Producer p = new Producer(prod);
        p.start();
        c.start();
    }
}
