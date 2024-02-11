import java.text.*;
import java.util.*;
import java.util.Random;

public class LuckyNumbers {

  public static void main(String[] args) {
    // Get current date and time in UTC format
    Date now = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    String utcDateTime = dateFormat.format(now);

    // Generate six random numbers between 1 and 49
    Random random = new Random();
    int[] numbers = new int[6];
    for (int i = 0; i < 6; i++) {
      numbers[i] = random.nextInt(49) + 1; // Range from 1 to 49 (inclusive)
    }

    // Print the message and lucky numbers
    System.out.println("Date and time in UTC: " + utcDateTime);
    System.out.print("Those are your lucky numbers: ");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
    System.out.println();
  }
}
