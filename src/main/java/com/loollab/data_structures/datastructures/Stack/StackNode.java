package com.loollab.data_structures.datastructures.Stack;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StackNode<T>{
    private T data;

    public StackNode ( T data ) {
        this.data = data;
    }
}
