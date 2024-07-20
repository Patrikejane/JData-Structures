package com.loollab.data_structures;

import com.loollab.data_structures.Sorting.BubbleSort;
import com.loollab.data_structures.datastructures.Stack.Stack;
import com.loollab.data_structures.datastructures.Stack.StackNode;
import com.loollab.data_structures.threads.VirtualThreads;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@SpringBootApplication
public class DataStructuresApplication {


	public static void main(String[] args) {
		SpringApplication.run ( DataStructuresApplication.class, args );

	}

	@Bean
	public CommandLineRunner cmdRunner() {

		return args -> {
			System.out.println ( "Command Line Runner !" );

			Stack <Integer> myStack = new Stack <Integer> ( 5 );

			myStack.push ( new StackNode <Integer> ( 1 ) );
			myStack.push ( new StackNode <Integer> ( 1 ) );
			myStack.push ( new StackNode <Integer> ( 1 ) );
			myStack.push ( new StackNode <Integer> ( 1 ) );

			Integer[] num = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
			Integer[] sortednum = BubbleSort.sort ( num,10);

			for (var n : sortednum) {
				System.out.print(n + " ");
			}

			VirtualThreads.viewCarrierThreadPoolSize();

			VirtualThreads.ThreadCreator ();



			CopyOnWriteArrayList <String> list = new CopyOnWriteArrayList<>();
			list.add("A");
			list.add("B");

			Iterator<String> iterator = list.iterator();
			list.add("C"); // Modification while iterating

// This will not throw an exception; iterator will see a snapshot of the collection
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		};

	}

}
