package org.application;

import org.boardgame.Board;
import org.boardgame.Position;

public class Main {
    public static void main(String[] args) {
        Position pos = new Position(3,5);
        System.out.println(pos);
        Board board = new Board(8,8);
    }
}