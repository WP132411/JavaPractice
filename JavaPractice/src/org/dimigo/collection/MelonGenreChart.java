package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		
		Map<String, List<Music>> map = new HashMap<>();
		
		List<Music> a = new ArrayList<Music>();
		
		a.add(new Music("내 첫사랑","베리굿"));
		a.add(new Music("또 다시 사랑","임창정"));
		a.add(new Music("부산에 가면","박진영"));
		
		List<Music> b = new ArrayList<Music>();
		
		b.add(new Music("커피","유재환,김예림"));
		b.add(new Music("다 잘될거야","쿨"));
		
		map.put("발라드", a);
		
		map.put("댄스", b);
		
		System.out.println("-------- << 멜론 장르별 챠트 >> --------");
		
		printList(map);
		
		System.out.println("-------- << 발라드 3위 곡 변경 >> --------");
		map.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		printList(map);
		
		System.out.println("-------- << 발라드 1위 곡 삭제 >> --------");
		map.get("발라드").remove(0);
		printList(map);
		
		System.out.println("-------- << 전체 리스트 삭제 >> --------");
		map.get("발라드").removeAll(a);
		map.get("댄스").removeAll(b);

	}
	
	public static void printList(Map<String, List<Music>> map) {
		
		for(String key : map.keySet()){
			System.out.println("[ " + key + " ]");
				for( int i = 0; i < map.get(key).size(); i++ ) {
					System.out.print((i + 1)+". ");
					System.out.println(map.get(key).get(i));
				}
			
		
	}
	
	
	}

}
