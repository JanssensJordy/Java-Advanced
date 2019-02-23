package app;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayLIFOQue deck = new ArrayLIFOQue();
        deck.push(3);
        deck.push(6);
        deck.push(9);
        deck.push(12);
        System.out.println(deck.peek());
        System.out.println(deck.pop());
        System.out.println(deck.isEmpty());
        System.out.println(deck);
    }
}