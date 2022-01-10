import java.util.*;

public class LL {
    public static void main(String args[]){
        //LinkedList
        //non - contiguous memory
        //insert in LL : O(1) (kuch constant operation k saath hi element insert hoga).
        //search in LL : O(n) 

        //node :  data , next

        //using linkedlist with collections

        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);

       int s = list.size();
       System.out.println(s);
       list.add(2, "aakanksha");
       System.out.println(list);

       for(int i =0; i<list.size(); i++){
           System.out.print(list.get(i) + "-->");
        }
       System.out.print("null");

       list.remove(2);
       System.out.println(list);

}
}