package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Diamanter diamanter = new Diamanter();
        Consumer consumer = new Consumer(diamanter);
        Producer producer = new Producer(diamanter);

        Thread consumerThread = new Thread(consumer);
        Thread producerThread = new Thread(producer);

        consumerThread.start(); // Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
        producerThread.start(); // Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
    }

}
