package Example01;

import java.util.ArrayList;
import java.util.Iterator;

public class Example02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Annie");
        list.add("Rose");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if ("Annie".equals(obj)) {

                it.remove();
                continue;
            }
            System.out.println(obj);
        }
        System.out.println(list);


    }

}

