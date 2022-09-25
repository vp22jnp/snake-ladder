package com.snakeAndLadder;
import java.util.Random;
public class uc2 {
    public static void main(String[] args) {
        Random random=new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("number is ::"+dice);

    }
}
