import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = Integer.parseInt(st.nextToken());
		int sumCnt = Integer.parseInt(st.nextToken());
		
		int[] input = new int[cnt + 1];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= cnt; i++) {
			input[i] = input[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < sumCnt; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			System.out.println(input[end] - input[start - 1]);
		}
	}
}