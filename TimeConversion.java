import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
String[] timeParts = s.split(":");
        
        // Extract hours, minutes, and seconds
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2].substring(0, 2)); // Extract the first two characters

        // Check if it's PM and not 12:00:00 PM
        if (s.contains("PM") && hours != 12) {
            hours += 12;
        }
        // Check if it's AM and 12:00:00 AM
        else if (s.contains("AM") && hours == 12) {
            hours = 0;
        }

        // Format the result in 24-hour time
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    }

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
