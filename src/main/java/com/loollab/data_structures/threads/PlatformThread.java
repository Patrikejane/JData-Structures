package com.loollab.data_structures.threads;

import java.util.concurrent.*;

/**
 * @author sskma
 * @Created 20/07/2024 - 11:26 PM
 * @project data_structures
 */
public class PlatformThread {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newFixedThreadPool ( 3 )) {

            Callable <Integer> task1 = new Area ( 5 );
            Callable <Integer> task2 = new Area ( 10 );
            Callable <Integer> task3 = new Area ( 15 );

            Future <Integer> future1 = executor.submit ( task1 );
            Future <Integer> future2 = executor.submit ( task2 );
            Future <Integer> future3 = executor.submit ( task3 );

            try {
                System.out.println ( "Result of task1: " + future1.get ( ) );
                System.out.println ( "Result of task2: " + future2.get ( ) );
                System.out.println ( "Result of task3: " + future3.get ( ) );
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace ( );
            } finally {
                executor.shutdown ( );
            }
        }
    }
}

// Task to be executed by threads
class Area implements Callable <Integer> {
    private final int number;

    Area(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return number * number;
    }
}
