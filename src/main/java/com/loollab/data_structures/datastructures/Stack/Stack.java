package com.loollab.data_structures.datastructures.Stack;

import com.loollab.data_structures.Exception.StackOverFlowException;
import lombok.Getter;
import lombok.Setter;


public class Stack<T> {

    private Integer topPointer;
    private StackNode[] stackData;
    private Integer initialSize;

    public Stack (Integer Size  ) {
        this.topPointer = 0;
        this.stackData = new StackNode[Size];
        this.initialSize = Size;
    }


    /**
     * Push: Adds an element to the top of the stack.
     *
     * @param stackNode the stack node
     */
    public void push(StackNode stackNode){
        if(this.isFull ()){
            throw new StackOverFlowException ( "Exception : Stack is Full" );
        }
        this.stackData[this.topPointer] = stackNode;
        ++this.topPointer;
    }

    /**
     * IsFull: Checks if the stack is full (in case of fixed-size arrays).
     *
     * @return the boolean
     */
    public boolean isFull(){
        return this.topPointer ==  this.initialSize -1;
    }




//    Push: Adds an element to the top of the stack.
//    Pop: Removes the top element from the stack.
//    Peek: Returns the top element without removing it.
//    IsEmpty: Checks if the stack is empty.
//    IsFull: Checks if the stack is full (in case of fixed-size arrays).



}


