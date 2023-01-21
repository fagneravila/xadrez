package org.boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.board = null; // iniciada como nula

    }

    // somente classes no mesmo pacote pode acessar as peças
    protected Board getBoard() {
        return board;
    }
}
