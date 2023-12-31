
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(-1);
        list.add(5);
        list.add(1);
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(list, 0, 5);
        
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(list, 3, 10);
        }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit) {
             System.out.println(numbers.get(i));   
            }
        }
    }
    
}
