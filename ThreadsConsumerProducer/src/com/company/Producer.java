package com.company;

import java.util.Random;

public class Producer implements Runnable
{
    private Diamanter diamanter;

    public Producer(Diamanter diamanter)
    {
        this.diamanter = diamanter;
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                diamanter.increment();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("        Har tilføjet en diamant");






            // vi bruger kun sleep her for at man kan see af der rent faktisk bliver produceret og konsumeret
            // diamanter
            Random random = new Random();
            try
            {
                Thread.sleep(random.nextInt(3000)); // Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of millisecond.
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}
