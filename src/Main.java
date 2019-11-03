import com.sun.source.tree.Tree;

import java.beans.PropertyEditorSupport;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    // Given K sorted lists of up to N elements in each list, return a sorted iterator over all the items.

        /*

        interface SortedIterator<Int> {
              constructor(List<List<Int>> input);
              boolean hasNext();
              Int next();
        }

        tuple()
        [2,1,2]

        1: [X, x, 5, 8, 9]
        2: [X, 7, 7,10]
        3: [X, X, 8]

        YourIterator i; ...
        i.next() // 0
        i.hasNext() // true
        i.next() // 0
        i.next() // 1
        */

    public class iterator{
        List<List<Integer>> input;
        int[] posPointers;
//        int lastVisited;


        public iterator(List<List<Integer>> input){
            this.input = input;
            posPointers = new int[input.size()];
            for(int i = 0; i < input.size(); i++){
                posPointers[i] = input.get(i).get(i);
            }
//            lastVisited = 0;
        }

        public int Next(){
        /*Plan
            - we have k posPointers store the least amount of number in each lsit
            - we init a variable store we loop pospointer
            - store stores the number the number closest to lstvisited
            - update pointerArray if list ends than store -1. update last visited
            - when we loop again and see -1 we skip
         */
            int[] store = {posPointers[0], 0};
            for(int i = 1; i < input.size(); i++){
                if(posPointers[i] == -1)
                    continue;
                if (input.get(i).get(posPointers[i]) < input.get(store[0]).get(posPointers[store[0]])) {
                    store[0] = input.get(i).get(posPointers[i]);
                    store[1] = i;
                }
            }

            if(posPointers[store[1]]++ == input.get(store[1]).size())
                posPointers[store[1]] = -1;
            return input.get()

        }

    }



    public static void main(String[] args){
        int[] a = {3,2,7,1,6}; //2 + 7 + 1

        System.out.println(a); //prints 1-3 (range)
    }

}
