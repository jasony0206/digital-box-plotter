package com.aiaa.urp.electronics;

import java.util.*;

public class TimerExample {
   public static void main(String[] args) {
   // creating timer task, timer
   TimerTask tasknew = new TimerTask() {
       @Override
       public void run() {
           System.out.println("working at fixed rate delay");

       }
   };
   Timer timer = new Timer();

   // scheduling the task at fixed rate delay
   timer.scheduleAtFixedRate(tasknew, 500, 1000);
   }
}