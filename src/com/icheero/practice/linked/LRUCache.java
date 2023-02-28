package com.icheero.practice.linked;

import java.util.LinkedHashMap;

public class LRUCache
{
    private final LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<>(capacity);
    }

    public int get(int key) {
        if (map.containsKey(key))
            return map.get(key);
        return -1;
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}
