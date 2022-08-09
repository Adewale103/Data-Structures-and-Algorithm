package hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kruskals {
    public static void main(String[] args) {

    }
    public static int kruskals(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
         int edges_size = gWeight.size();
        int distinctSum = 0;
        for (int i = 0; i < gWeight.size()-1; i++) {
            if(gWeight.get(i) > gWeight.get(i+1)){
            int temp = gWeight.get(i);
            gWeight.add(i,gWeight.get(i+1));
            gWeight.add(i+1,temp);

            temp = gFrom.get(i);
            gFrom.add(i,gFrom.get(i+1));
            gFrom.add(i+1,temp);

            temp = gTo.get(i);
            gTo.add(i,gWeight.get(i+1));
            gTo.add(i+1,temp);
            }
        }

        for (int i = 0; i < edges_size; i++) {
            Set<Integer> from =new HashSet<>();
            Set<Integer> to =new HashSet<>();

            if((!to.contains(gFrom.get(i)) || from.contains(gFrom.get(i))) && (!to.contains(gTo.get(i)) || from.contains(gTo.get(i))) ){
                distinctSum+= gWeight.get(i);
            }
            from.add(gFrom.get(i));
            to.add(gTo.get(i));
        }

        return distinctSum;
    }



}
