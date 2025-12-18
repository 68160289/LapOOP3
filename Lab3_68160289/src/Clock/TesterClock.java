package Clock;

import java.util.concurrent.Callable;

public class TesterClock {
    public static void main(String[] args){
       //test case 1 incorrect
        System.out.println("Test case 1 : Create Object");
        System.out.println("Test case 1 : with incorrect");
        Clock objk1 = new Clock(99,88);
        System.out.println("Time : "+ objk1);
        System.out.println("Test case 2 : with incorrect");
        objk1 = new Clock(-2,34);
        System.out.println("Time : "+ objk1);
        System.out.println("Test case 3 : with incorrect");
        objk1 = new Clock(23,15);
        System.out.println("Time : "+ objk1);
        System.out.println();
        //test case 2 check method
        System.out.println("Test case 2 check method setTime()");
        System.out.println("Set time to 2:9");
        objk1.setTime(2,9);
        System.out.println("Hour : "+objk1.getHour()+" Minute : "+objk1.getMinute());
        System.out.println();
        //test case 3 check increase
        System.out.println("Test case 3 check increase");
        Clock myClock = new Clock(23,55);
        for (int i = 0; i < 10 ; i++) {
            System.out.println(myClock);
            myClock.increaseMinute();
        }
    }
}
