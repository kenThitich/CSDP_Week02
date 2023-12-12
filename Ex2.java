import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ex2 {
    public static final int MAX = 5;
    public static void main(String[] args) {
            System.out.println("Welcome to the Application!");

            List<Integer> nums = getInput();
            
            sorting(nums);
            showOutput(nums);
    }

    public static List<Integer> getInput(){
        Scanner inp = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while(nums.size() < MAX) {
                
            String s = inp.nextLine();
            
            int num = checkTypeInput(s);                ;
            
            if(checkInput(num)) {
                nums.add(num);
            }
        }

        inp.close();
        return nums;
    }

    public static int checkTypeInput(String no){
        try {
            int num = Integer.parseInt(no);
            return num;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return 99999999; /*null*/
        }
    }

    public static boolean checkInput(int num){
        if(num < 0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    public static void sorting(List<Integer> nums){
        Collections.sort(nums);
    }

    public static void showOutput(List<Integer> nums){
        for(int num : nums)
                System.out.print(num+" ");
    }
}