import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            // Read the number of elements
            int num = Integer.parseInt(br.readLine());
            int[] numArr = new int[num];

            // Read the elements into the array
            for (int i = 0; i < num; i++) {
                numArr[i] = Integer.parseInt(br.readLine());
            }

            // Perform Bubble Sort
            for (int i = 0; i < numArr.length - 1; i++) {
                for (int j = 0; j < numArr.length - 1 - i; j++) {
                    if (numArr[j] > numArr[j + 1]) {
                        // Swap the elements
                        int temp = numArr[j];
                        numArr[j] = numArr[j + 1];
                        numArr[j + 1] = temp;
                    }
                }
            }

            // Output the sorted array
            for (int i : numArr) {
                bw.write(i + "\n");
            }
            bw.flush();
        }
    }
}
