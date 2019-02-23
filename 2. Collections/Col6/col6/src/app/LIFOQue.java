package app;

public interface LIFOQue <E>{
    public Boolean isEmpty();
    public void push(E e);
    public E pop();
    public E peek();
}