/*
package com.madhaviv;

*/
/**
 * Created by madhavi.venu on 2/9/15.
 *//*

public class ArrayStack implements Stack {

    public static final int CAPACITY = 1024;

    private int N;
    private Object S[];
    private int top = -1;

    public ArrayStack()
    {
        this(CAPACITY);
    }

    public ArrayStack(int size)
    {
        N = size;
        S= new Object[N];
    }

    public int size()
    {
        return top + 1;
    }

    public boolean isEmpty()
    {
        return (top < 0);
    }

    public void push(Object ele) throws StackFullException
    {
        if(size() == N)
            throw new StackFullException ("Stack Overflow") ;
        S[++top] = ele;
    }

    public Object top()throws StackEmptyException
    {
        if(isEmpty())
            throw new StackEmptyException ("Stack Empty");

        return S[top];
    }

    public Object pop()
    {
        if(isEmpty())
            throw new StackEmptyException ("Stack Empty");
        return S[top--];
    }

}
*/
