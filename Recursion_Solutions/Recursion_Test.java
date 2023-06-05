import java.util.ArrayList;
import java.util.List;

class Recursion_Test{
     public static void main(String[] args) {

        System.out.println("Testing...");
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        System.out.println(list);
        changeList(list);
        System.out.println(list);

        
    }
    public static void changeList(List<Integer> list){
        list.add(1);
    }
}