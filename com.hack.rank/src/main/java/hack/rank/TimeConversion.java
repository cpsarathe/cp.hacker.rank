/**
 * 
 */
package hack.rank;

/**
 * @author Admin
 *
 */
import java.io.*;
import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isPM = false;
        boolean isAM = false;
        int index = 0;
        if(input.indexOf("PM")>0){
            isPM = true;
            index = input.indexOf("PM");
        }else if(input.indexOf("AM")>0){
            isAM = true;
            index = input.indexOf("AM");
        }
        if(index>0) {
            input = input.substring(0,index);    
        }
        
        String times[] = input.split(":");
        int hr = Integer.valueOf(times[0]);
        int min = Integer.valueOf(times[1]);
        int sec = Integer.valueOf(times[2]);
        
        if(isPM) {
            if(hr < 12){
              hr+=12;  
            } 
        }
        if(isAM) {
           if(hr==12){
              hr-=12;  
            } 
        }   
        String output = "" + get2Digit(hr) + ":" + get2Digit(min) + ":" + get2Digit(sec);
        System.out.println(output);
            
    }
    
    public static String get2Digit(int num){
        if(num<10){
            return "0"+num;
        }
        return ""+num;
    }
}
