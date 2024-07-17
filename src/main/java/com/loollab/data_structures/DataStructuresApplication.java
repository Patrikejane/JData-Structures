package com.loollab.data_structures;

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
			for (var j = 0; j < 9; j++) {
			for (var i = 1; i < 9 -j; i++) {
				if (num[i] > num[i + 1]) {
					var temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}
		}


			for (var n : num) {
				System.out.print(n + " ");
			}


		};

	}

}
