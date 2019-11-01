package day13;

import java.util.Random;

public class ProbSol {
    public static void main(String[] args) {
        final int MAXIDX = 6;
        final int MAXLEN = 10;
        final int START = 4096;

        int stor[][] = null;
        stor = new int[MAXIDX][MAXLEN];
        int idxCnt[] = {0,0,0,0,0,0};

        int freeMme[] = new int[10];

        Random rand = new Random();

        for(int i=0; i< MAXLEN; i++) {
            int temp = rand.nextInt(131072) + 1;
            System.out.println("temp = " + temp);





        }


    }
}
