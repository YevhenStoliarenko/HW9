package MyHashMap;

import java.util.Arrays;
import java.util.HashMap;

public class MyHashMap<K, V> {

    private Entry<K, V>[] entries = new Entry[4];
    private int size;

    public void put(K newKey, V value) {
        int index = getBucketsIndex(newKey);
        Entry<K, V> newEntry = new Entry<>(newKey, value);

        if (entries[index] == null) {
            entries[index] = newEntry;
        } else {

            Entry<K, V> current = entries[index];
            Entry<K, V> previos = null;

            while (current != null) {
                if (current.key.equals(newKey)) {
                    if (previos == null) {
                        newEntry.next = current.next;
                        current = newEntry;
                        return;
                    } else {
                        newEntry.next = current.next;
                        previos.next = newEntry;
                        return;
                    }
                }
                previos = current;
                current = current.next;
            }
            previos.next = newEntry;

        }
        size++;
    }

    public boolean remove(K key) {
        int index = getBucketsIndex(key);
        if (entries[index] == null) {
            return false;
        } else {
            Entry<K, V> current = entries[index];
            Entry<K, V> previos = null;

            while (current != null) {
                if (current.key.equals(key)) {
                    if (previos == null) {
                        entries[index] = entries[index].next;
                        return true;
                    } else {
                        previos.next = current.next;
                        return true;
                    }
                }
                previos = current;
                current = current.next;
            }
        }
        return false;
    }


    public void clear() {
        for (int i = 0; i < entries.length; i++) {
            entries[i] = null;
        }

    }

    public int size() {
        size = 0;
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
                Entry<K, V> entry = entries[i];
                while (entry != null) {
                    entry = entry.next;
                    size++;
                }
            }
        }
        return size;
    }

    public V getValue(K getKey) {
        int index = getBucketsIndex(getKey);
        if (entries[index] == null) {
            return null;
        } else {
            Entry<K, V> current = entries[index];
            while (current != null) {
                if (current.key.equals(getKey)) {
                    return current.value;
                }
                current = current.next;
            }
            return null;
        }

    }


    public int getBucketsIndex(K key) {
        return Math.abs(key.hashCode() % entries.length);
    }

    public void display() {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
                Entry<K, V> entry = entries[i];
                while (entry != null) {
                    System.out.print(entry);
                    entry = entry.next;
                    size++;
                }
            }
        }
    }


    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{ " +
                    "key=" + key +
                    ", value=" + value +
                    '}' + " \n";
        }
    }

}
