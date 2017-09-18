package com.readcollin0.apcs.util;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListRandom {
	
	private static final Random random = new Random();
	
	public static Object getRandom(Object[] array) {
		return array[random.nextInt(array.length)];
	}
	
	public static Object getRandom(List<Object> list) {
		return list.get(random.nextInt(list.size()));
	}
	
	public static Object getRandom(HashMap<Object, Object> hashmap) {
		return hashmap.get(getRandom(hashmap.keySet()));
	}

	private static Object getRandom(Set<Object> keySet) {
		return getRandom(keySet.toArray());
	}
	
}
