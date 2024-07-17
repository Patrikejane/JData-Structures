package com.loollab.data_structures;

import com.loollab.data_structures.Sorting.BubbleSort;
import com.loollab.data_structures.datastructures.Stack.Stack;
import com.loollab.data_structures.datastructures.Stack.StackNode;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
		};

	}

}
