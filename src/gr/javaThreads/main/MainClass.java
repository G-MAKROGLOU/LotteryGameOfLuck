package gr.javaThreads.main;

import gr.javaThreads.classes.*;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;

public class MainClass{

    //static method that displays a 2d array as the grid that contains the 80 numbers of a kino game
    public static void ShowGrid(int[][] numbers){
        for (int[] number : numbers) {
            for (int i : number) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }

    //main method of the program
    public static void main(String[] args){

        //The 2d array that we pass as the parameter of the ShowGrid method
        int[][] numbers = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15, 16,17, 18, 19, 20},
        {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
        {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
        {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
        {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
        {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
        {71, 72, 73, 74, 75, 76, 77, 78, 79, 80}
    };

        ShowGrid(numbers);
        System.out.print("\n");

        Calendar date = Calendar.getInstance();
        date.set(Calendar.HOUR_OF_DAY, 19);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);

        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                ThreadOne thread = new ThreadOne();
                thread.run();
            }
        }, date.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));

    }//end of main method
}//end off MainClass