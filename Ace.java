import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
 
public class ACE {
 
    public static void main(String[] args) throws Exception {
        System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar dob = Calendar.getInstance();
        dob.setTime(sdf.parse(input));
        System.out.println("Age is:" + getAge(dob));
    }
