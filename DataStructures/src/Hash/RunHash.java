package Hash;

public class RunHash {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(6,"s");
        hashTable.put(8, "ss");
        hashTable.put(11, "sss");
        hashTable.put(6,"S+");
        hashTable.remove(8);
        System.out.println(hashTable.get(6));


        // Most Repeated

        int[] array = new int[]{1,2,3,5,6};
        MostRepeated mostRepeated = new MostRepeated();
        System.out.println(mostRepeated.findMostRepeatedNumber(array));
    }
}
