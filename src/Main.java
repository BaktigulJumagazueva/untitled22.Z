import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random= new Random();
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list1.add(random.nextInt(1, 100));
        }
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) % 2 == 0) {
                    list2.add(list1.get(i));
                }
                    if (list1.get(i) % 2 == 1) {
                        list3.add(list1.get(i));
                    }
            }
                System.out.println(list1);
                System.out.println("не четные: "+list2);
                System.out.println("четные: "+list3);
    }
}