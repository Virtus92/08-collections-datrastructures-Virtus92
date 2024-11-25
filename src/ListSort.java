import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListSort {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(99) + 1);
        }
        System.out.println("Unsortierte liste.");
        System.out.println(list);

        for (int i=0; i<list.size(); i++) {
            for (int j=0; j<(list.size()-1); j++) {
                if (list.get(j) > list.get(j+1)) {
                    int temp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("Sortierte liste:");
        System.out.println(list);
    }
}
