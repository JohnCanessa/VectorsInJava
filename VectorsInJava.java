import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

/**
 * 
 */
public class VectorsInJava {

    /**
     * Test scaffolding.
     */
    public static void main(String[] args) throws IOException {
        
        // **** initialization ****
        int[] arr = null;

        // **** open a buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // **** create and read arr[] values used to populate a vector ****
        arr = Arrays.stream(br.readLine().trim().split(","))
                        .mapToInt(Integer::parseInt).
                        toArray();

        // **** close the buffered reader ****
        br.close();

        // **** display the contents of the array ****
        System.out.println("main <<<  arr: " + Arrays.toString(arr));

        // **** create and populate a vector ****
        Vector<Integer> v1 = new Vector<Integer>();

        // **** display size and capacity ****
        System.out.println("main <<< size: " + v1.size() + " capacity: " + v1.capacity());

        // **** populate vector ****
        for(int a : arr)
            v1.add(a);

        // **** display vector ****
        System.out.println("main <<<   v1: " + v1.toString());
        System.out.println("main <<< size: " + v1.size() + " capacity: " + v1.capacity());

        // **** insert value at specified position ****
        v1.add(2, 17);

        // **** display vector ****
        System.out.println("main <<<   v1: " + v1.toString());
        System.out.println("main <<< size: " + v1.size() + " capacity: " + v1.capacity());

        // **** add a couple more values ****
        v1.add(19);
        v1.add(23);

        // **** display vector ****
        System.out.println("main <<<   v1: " + v1.toString());
        System.out.println("main <<< size: " + v1.size() + " capacity: " + v1.capacity());

        // **** traverse the vector ****
        System.out.print("main <<<   v1: [");
        for (int i = 0; i < v1.size(); i++) {
            System.out.print(v1.get(i));
            if (i < v1.size() - 1)
                System.out.print(", ");
            else
                System.out.print("]");
        }
        System.out.println();

        // **** remove some entries from the vector ****
        for (int i = 0; i < 10 && !v1.isEmpty(); i++) {

            // **** remove entry i from vector ****
            try {
                int e = v1.remove(i);
                System.out.println("main <<< removed: e: " + e);
            } catch (Exception e) {
                System.out.println("main <<< EXCEPTION e: " + e.toString() + " i: " + i);
                break;
            }

        }

        // **** display vector ****
        System.out.println("main <<<   v1: " + v1.toString());
        System.out.println("main <<< size: " + v1.size() + " capacity: " + v1.capacity());

        // **** double the sie of the vector (will add null elements) ****
        v1.setSize(v1.size() * 2);

        // **** display vector ****
        System.out.println("main <<<   v1: " + v1.toString());
        System.out.println("main <<< size: " + v1.size() + " capacity: " + v1.capacity());

        // **** remove all null elements from the vector ****
        while (v1.contains(null))
            v1.remove(null);

        // **** display vector ****
        System.out.println("main <<<   v1: " + v1.toString());
        System.out.println("main <<< size: " + v1.size() + " capacity: " + v1.capacity());

        // **** trim capacity to current size ****
        v1.trimToSize();

        // **** display vector ****
        System.out.println("main <<<   v1: " + v1.toString());
        System.out.println("main <<< size: " + v1.size() + " capacity: " + v1.capacity());

        // **** add element to the vector ****
        v1.add(5);

        // **** sort the vector contents ****
        Collections.sort(v1);

        // **** display vector ****
        System.out.println("main <<<   v1: " + v1.toString());
        System.out.println("main <<< size: " + v1.size() + " capacity: " + v1.capacity());
    }

}