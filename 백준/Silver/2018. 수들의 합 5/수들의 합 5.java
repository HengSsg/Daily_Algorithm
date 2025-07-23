import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		int count = 1; // 마지막N 의 값을 미리 포함한 내용
		int start_idx = 1;
		int end_idx = 1;
		int sum = 1;
		
		while(end_idx != N) {
 			if(sum == N) {
				end_idx++;
				sum += end_idx;
				count++;
			} else if(sum > N) {
				sum -= start_idx;
				start_idx++;
			} else {
				end_idx++;
				sum += end_idx;
			}
		}
		
		System.out.println(count);
	}
}
