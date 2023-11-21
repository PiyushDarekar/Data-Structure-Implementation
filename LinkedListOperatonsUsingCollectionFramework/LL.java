package LinkedListOperatonsUsingCollectionFramework;
import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.addFirst("a");
        list.addFirst("This");
        list.add("list");
        list.add(1, "is");
        list.addLast("of elements");
        
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
