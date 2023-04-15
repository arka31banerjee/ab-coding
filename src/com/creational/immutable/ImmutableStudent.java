package com.creational.immutable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ImmutableStudent {
	private final int id;
	private final String name;
	private final Map<String,Integer> marksMap;
	
	public ImmutableStudent(int id, String name, Map<String,Integer> marksMap) {
		this.id = id;
		this.name = name;
		this.marksMap = Collections.unmodifiableMap(marksMap);
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Map<String, Integer> getMarksMap() {
		Map<String, Integer> tempMap = new HashMap<>();
		for(Map.Entry<String, Integer> entry : this.marksMap.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return marksMap;
	}
	
	@Override
	public String toString() {
		return "ImmutableStudent [id=" + id + ", name=" + name + ", marksMap=" + marksMap + "]";
	}
}
