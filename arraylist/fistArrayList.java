
import java.util.ArrayList;
import java.util.Scanner;

public class fistArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("size of array list:");
        int n =input.nextInt();
        ArrayList<Integer> ratul = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data"+(i+1)+":");
            int value=input.nextInt();
            ratul.add(value);
        }
        
        System.out.println(ratul.get(3));

    }

}
