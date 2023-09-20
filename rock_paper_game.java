import java.util.Random;
import java.util.Scanner;
public class rock_paper_game {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("ENTER \n 1 for Rock \n 2 for Paper \n 3 for scissor");
        int m = a.nextInt();
       // System.out.println(m);
        Random b = new Random();
        int c = b.nextInt(1, 3);
       // System.out.println(c);

        switch (m) {
            case 1: {
                if (c == 1)
                    System.out.println("YOU AND COMPUTER, BOTH CHOSE ROCK\nPLAY AGAIN");
                else if (c == 2) {
                    System.out.println("YOU CHOSE ROCK \nCOMPUTER CHOSE PAPER \nCOMPUTER WINS");
                } else if (c == 3) {
                    System.out.println("YOU CHOSE ROCK \nCOMPUTER CHOSE SCISSOR \nYOU WINS");
                }
            }break;
            case 2:{
                if (c == 1)
                    System.out.println("YOU CHOSE PAPER \nCOMPUTER CHOSE ROCK \nYOU WINS");
                else if (c == 2) {
                    System.out.println("YOU AND COMPUTER, BOTH CHOSE PAPER\nPLAY AGAIN");
                } else if (c == 3) {
                    System.out.println("YOU CHOSE PAPER \nCOMPUTER CHOSE SCISSOR \nCOMPUTER WINS");
                }

            }break;
            case 3:{
                if (c == 1)
                    System.out.println("YOU CHOSE SCISSOR \nCOMPUTER CHOSE ROCK \nCOMPUTER WINS");
                else if (c == 2) {
                    System.out.println("YOU CHOSE SCISSOR \nCOMPUTER CHOSE PAPER \nYOU WINS");
                } else if (c == 3)
                    System.out.println("YOU AND COMPUTER, BOTH CHOSE SCISSOR \nPLAY AGAIN");

            }break;
        }
    }}