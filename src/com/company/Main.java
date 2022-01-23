package com.company;

import java.util.Scanner;

public class Main {

    public static int ComputerMove(int matches) {
        return 4 - matches;
    }

    public static int PlayerMove() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int numOfMatches = 20;
        int playerMatches = 1;
        int computerMatches;

        System.out.println("На столе осталось " + numOfMatches + " спичек.");

        while(true) {
            computerMatches = ComputerMove(playerMatches);
            numOfMatches -= computerMatches;
            System.out.println(" - Количество выбранных компьютером спичек = " + computerMatches);
            if (numOfMatches == 1) break;
            System.out.println("На столе осталось " + numOfMatches + " спичек.");


            while(true) {
                System.out.println(" - Ход игрока. Введите количество спичек: ");
                playerMatches = PlayerMove();

                if (playerMatches > 3 || playerMatches < 1) System.out.println("Некорректное количество спичек!");
                else break;
            }

            numOfMatches -= playerMatches;
            System.out.println("На столе осталось " + numOfMatches + " спичек.");
        }

        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}
