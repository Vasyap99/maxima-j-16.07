import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Main{
    public static void main(String[]s){
        ArrayList<String> al=new ArrayList<>();
        al.addAll(List.of("Name1","Name2","Name3","Ivan","Name5","Name6","Name7","Name7","Name9","Name10")); 
        al.add(5,"New Name");
        al.remove(5);
        System.out.println(al.contains("Ivan"));
        System.out.println(al.get(9));
        al.set(4,"Taras");

        Iterator<String> it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List<String> nl= al.subList(5,10);
        System.out.println(nl);

        ArrayList<String> l2=new ArrayList<>(al);
        System.out.println(l2);
 
        l2.removeAll(al);
        System.out.println(l2);

        LinkedList<String> ll=new LinkedList<>();
        ll.addAll(List.of("City1","City2","City3","City4","City5","City6","City7","City8","City9","City10"));
   
        ll.addAll(0,List.of("City11","City12","City13","City14","City15"));
        System.out.println(ll);

        ll.addAll(List.of("City21","City22","City23","City24","City25"));
        System.out.println(ll);

        for(int j=0;j<3;j++) ll.removeFirst();
        System.out.println(ll);

        for(int j=0;j<4;j++) ll.removeLast();
        System.out.println(ll);
    }
}