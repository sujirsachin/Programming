package Hash;

import java.util.LinkedList;

public class HashTable {
    private class Entry
    {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value)
    {
        var index = hash(key);
        if(entries[index]==null)
            entries[index] = new LinkedList<Entry>();
        var bucket = entries[index];
        for(var entry: bucket)
        {
            if(entry.key == key)
            {
                entry.value = value;
                return;
            }
        }
        bucket.addLast(new Entry(key, value));
    }

    public String get(int key)
    {
        var entry = getEntry(key);
        return (entry == null) ? null : entry.value;
    }

    public void remove(int key)
    {
        var index = hash(key);
        var entry = getEntry(key);
        if(entry != null)
            entries[index].remove(entry);
    }

    private Entry getEntry(int key)
    {
        var index = hash(key);
        if(entries[index] == null)
            return null;
        var bucket = entries[index];
        for(var entry: bucket)
        {
            if(entry.key == key)
                return entry;
        }
        return null;
    }

    private int hash(int key)
    {
     return key % entries.length;
    }
}
