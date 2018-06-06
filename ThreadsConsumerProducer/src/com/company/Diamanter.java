package com.company;

public class Diamanter
{
    // vi bruger blandt andet syncronized til at undgå "race conditions" hvor at to objekter kalder forskellige metoder der prøver at tilgå den samme resource.
    private int diamantCount = 0;

    // synchronized gør at metoden kun kan blive kaldt en af gangen. Den gør at det objekt der kalder metoder har en lock på metoden. andre objekter kan ikke tilgå den
    public synchronized void increment() throws InterruptedException // synchronized gør at der kun er en producer thread af gangen der kan tilføje til diamantcounten.
    {
        while (diamantCount >= 5)
        {
            wait(); // venter OG lytter på notifyAll
        }
        diamantCount = diamantCount + 1;
        System.out.print("Antal Diamanter: " + diamantCount);
        notifyAll(); // signalerer til Consumer, at der er én til diamant.
    }

    public synchronized void decrement() throws InterruptedException
    {
        while (diamantCount <= 0)
        {
            wait(); // venter OG lytter på notifyAll
        }
        diamantCount = diamantCount - 1;
        System.out.print("Antal Diamanter: " + diamantCount);
        notifyAll(); // signalerer til producer at den har taget én diamant. kunne også have brugt notify() til en enkelt tilfældig producer

    }


}
