class LRUCache {

    LinkedHashMap<Integer, Integer> map;
    int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        map = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        map.put(key, value);

        if (map.size() > cap) {
            int first = map.keySet().iterator().next();
            map.remove(first);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */