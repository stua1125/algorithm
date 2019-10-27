package coding_pretice;

import java.util.HashMap;
import java.util.Map;

// 좌표 이동 문제 (중복된 거리 뺴는것 map으로 해결)
public class level3_190927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , Integer> result = new HashMap<>();

		String dirs = "ULURRDLLU";
		
		int[] now = new int[] {0, 0};
		int[] next = new int[] {0, 0};
				
		for(int i = 0; i < dirs.length(); i++) {
			System.out.println(dirs.charAt(i));
			if(dirs.charAt(i) == 'L') {
				if(now[0] > -5) {
					next[0] = now[0]-1;
					addMap(result, now, next);
					now[0] = now[0]-1;
				}
			} else if(dirs.charAt(i) == 'R') {
				if(now[0] < 5) {
					next[0] = now[0]+1;
					addMap(result, now, next);
					now[0] = now[0]+1;
				}
			} else if(dirs.charAt(i) == 'U') {
				if(now[1] < 5) {
					next[1] = now[1]+1;
					addMap(result, now, next);
					now[1] = now[1]+1;
				}
			} else if(dirs.charAt(i) == 'D') {
				if(now[1] > -5) {
					next[1] = now[1]-1;
					addMap(result, now, next);
					now[1] = now[1]-1;
				}
			}
		}
		
		System.out.println("result: " + result.size());
		
		
		
	}

	public static void addMap(Map<String , Integer> result, int[] now, int[] next) {
		String key = now[0] + "_" + now[1] + "_" + next[0] + "_" + next[1];
		String key_reverse = next[0] + "_" + next[1] + "_" + now[0] + "_" + now[1];
		System.out.println(key);
		System.out.println(key_reverse);
		if(result.containsKey(key) || result.containsKey(key_reverse)){
			return ;
		} else {
			result.put(key, 1);
		}
	}
	
		
		
}

