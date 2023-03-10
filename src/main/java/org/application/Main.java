package org.application;

import org.chess.ChessException;
import org.chess.ChessMatch;
import org.chess.ChessPiece;
import org.chess.ChessPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();


        while (true) {
            try {
                UI.clearScreen();
                UI.printMach(chessMatch, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);


                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(sc);
                ChessPiece capturePiece = chessMatch.performChessMove(source,target);

                if(capturePiece != null){
                    captured.add(capturePiece);
                }


            }catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }


        }
    }
}