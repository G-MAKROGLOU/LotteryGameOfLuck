package gr.javaThreads.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadOne extends Thread {
    //This is the run method of the thread
    @Override
    public void run() {
        Timer timer = new Timer();
        List<Integer> numbersList = new ArrayList<>();

        //timer that generates a random number from 1-80 every 5 seconds
        timer.schedule(new TimerTask(){
            //This is the run method of the TimerTask
            @Override
            public void run() {
                int random = (int) Math.floor(Math.random()*79+1);
                if(!numbersList.contains(random)){
                    numbersList.add(random);
                    System.out.print(random + " ");
                }
                if(numbersList.size() == 20){
                    for(int k = 1; k <= 2; k++){
                        try{
                            Thread.sleep(100000);
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.print("\n");
                    numbersList.clear();
                }
            }
        },0,5000);
    }
}

