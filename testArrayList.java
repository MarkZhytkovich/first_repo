import java.util.*;

public class testArrayList {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);

        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);
    }



}

