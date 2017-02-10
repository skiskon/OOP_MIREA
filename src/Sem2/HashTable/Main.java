package Sem2.HashTable;
public class Main {
    public static void main(String[] args) {
        MyHashTable table = new MyHashTable(100);
        table.put("table", "стол");
        String r = table.getK("table");
        System.out.println(r);


    }
}
