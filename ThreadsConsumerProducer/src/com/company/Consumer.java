package com.company;

import java.util.Random;

public class Consumer implements Runnable
{
    private Diamanter diamanter;

    public Consumer(Diamanter diamanter)
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
                diamanter.decrement();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("        Har fjernet en diamant");


            // vi bruger kun sleep her for at man kan see af der rent faktisk bliver produceret og konsumeret
            // diamanter
            Random random = new Random();
            try
            {
                Thread.sleep(random.nextInt(3000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
