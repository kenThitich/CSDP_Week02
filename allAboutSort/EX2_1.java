import java.util.Scanner;

public class EX2_1 {
    public static void main(String[] args){
        System.out.println("Choose Sort : 1 -> Insertion Sort, 2 -> Merge Sort, 3 -> Selection Sort");
        Scanner sc = new Scanner(System.in);

        int inp = sc.nextInt();
        switch(inp){
            case 1: 
                SortingProcessor.process(new InsertionSorting());
                break; 
            case 2: 
                SortingProcessor.process(new MergeSorting());
                break; 
            case 3: 
                SortingProcessor.process(new SelectionSorting());
                break; 
        }
    }
}
