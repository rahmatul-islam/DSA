
import java.util.ArrayList;
import java.util.Collections;

public class list_get {

    public static void main(String[] args) {

        ArrayList<Integer> ratul = new ArrayList<Integer>();
        ratul.add(10);
        ratul.add(30);
        ratul.add(40);
        ratul.add(60);
        System.out.println(ratul.get(3));

        //add value
        ratul.add(1,20);
        System.out.println(ratul);
        //change element
        ratul.set(4, 50);
        System.out.println(ratul);
        //remove
        ratul.remove(3);
        System.out.println(ratul);
        //sort
        Collections.sort(ratul);
        System.out.println(ratul);


    }
}
