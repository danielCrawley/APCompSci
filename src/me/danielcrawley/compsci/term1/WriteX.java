package me.danielcrawley.compsci.term1;

import java.util.Random;

/**
 * Created by 257019 on 1/30/2015.
 */
public class WriteX {

    public static void main(String[] args) {

        int[][] list = new int[10][10];

        for(int i = 0; i < list.length; i++){

            for(int j=  0; j < list[i].length; j++){

                list[i][j] = new Random().nextInt(9) + 1;

            }

        }

        createX(list);

        for(int i = 0; i < list.length; i++){

            for(int j=  0; j < list[i].length; j++){

                System.out.print(list[i][j]);

            }

            System.out.println();

        }

    }

    public static void createX(int[][] list){

        for(int i = 0; i < list.length; i++){

            int j = list.length - i - 1;

            list[i][i] = 0;
            list[i][j] = 0;

        }

    }
}
