import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] bucket = new int[Integer.parseInt(st.nextToken())];
		int count = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int ballNum = Integer.parseInt(st.nextToken());
			
			for(int j = start - 1; j < end; j++) {
				bucket[j] = ballNum;
			}
		}
		
		for(int i = 0; i < bucket.length; i++) {
			System.out.print(bucket[i] + " ");
		}
		
		
		br.close();
	}
}