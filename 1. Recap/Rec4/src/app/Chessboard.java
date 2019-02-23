package app;

import java.util.ArrayList;

public class Chessboard {
    private int size;
    private ArrayList<ArrayList<Object>> board;

    public Chessboard(int size) {
        this.size = size;
        this.board = createBoard();
    }
    
    private ArrayList<ArrayList<Object>> createBoard(){
        ArrayList<ArrayList<Object>> board = new ArrayList<ArrayList<Object>>();
        for (int j = 0; j < this.size; j++) {
            ArrayList<Object> row = new ArrayList<>();
            for (int i = 0; i < this.size; i++) {
                Object value = ((i%2 == 0) ? "black" : "white");
                row.add(value);
           }
            board.add(row);
        }
        return board;
    }

    public void printBoard(){
        for (int j = 0; j < this.size; j++) {
            for (int i = 0; i < this.size; i++) {
                int vak = (this.board.get(j).get(i).equals("black") ? 0x25A1 : 0x25A0 );
                System.out.printf(" %c ", vak );
            }
            System.out.printf("%c", '\n' );
        }
        
    }
}