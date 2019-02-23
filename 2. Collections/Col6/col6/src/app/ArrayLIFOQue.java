package app;
import java.util.ArrayDeque;

public class ArrayLIFOQue implements LIFOQue<Number>{
    private ArrayDeque<Number> deque = new ArrayDeque<Number>();


    @Override
    public Boolean isEmpty() {
        return this.deque.isEmpty();
    }

    @Override
    public void push(Number e) {
        this.deque.push(e);
    }

    @Override
    public Number pop() {
        return this.deque.pop();
    }

    @Override
    public Number peek() {
        return this.deque.peek();
    }

    @Override
    public String toString(){
        String output = "";
        for (Number var : this.deque) {
            output += var + ", ";
        }
        return output;
    }
    
}