
//hashing
//hashmap=> is the data structure which store the data in the mapping of key-value pair 
//in this we map the a keys and its perticular value 
//it is thepower full datastructure to searching , insertion , deletion, contains
//it takes constants times

// ==============================================

//map interface
//hashmap, linked hashmap, sorted 
//hashmap=> unordered
//linked hashmap=> preserved insertion order
//sorted => maintain the elements in sorted order => on the basis of key value 

// ===================================================

// import java.util.HashMap;
// import java.util.Map;

import java.util.*;

public class hash_map_1 {

    static void HashMapMethods() {

        // syntax

        Map<String, Integer> mp = new HashMap<>(); // syntax
        // HashMap<String, Integer> mp = new HashMap<>(); // syntax

        // adding entry (string , integer )
        // for that we use put method

        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

        // getting the value of the key from hash map

        int a = mp.get("Yash"); // have to give the key
        System.out.println(a); // 16

        // it will return null if key does not have any value
        // like

        System.out.println(mp.get("rahul")); // null

        // changing or updating the values
        // put is used for inserting and updating

        mp.put("Akash", 25); // updating
        System.out.println(mp.get("Akash"));// 25

        // removing the pair from has map
        System.out.println(mp); // {Lav=17, Rishika=19, Yash=16, Harry=18, Akash=25}
        mp.remove("Akash");
        System.out.println(mp); // {Lav=17, Rishika=19, Yash=16, Harry=18}

        // while removing if the key is not present then it will retyren null
        System.out.println(mp.remove("varad")); // null

        // checking key is present or not
        System.out.println(mp.containsKey("Yash")); // truw
        System.out.println(mp.containsKey("Akash")); // false

        // adding the key only if the new key doesn't exist already
        // 1=>
        if (!mp.containsKey("Yash")) {
            mp.put("Yash", 45);
        }

        // 2=>
        // there is the methods
        mp.putIfAbsent("Yash", 25);
        mp.putIfAbsent("Varad", 22);
        System.out.println(mp); // {Lav=17, Rishika=19, Varad=22, Yash=16, Harry=18}

        // getting all the keys from the hash map
        // for that we use KeySet();
        // it will return a set which contains all key
        System.out.println(mp.keySet()); // [Lav, Rishika, Varad, Yash, Harry]

        // getting all the value
        System.out.println(mp.values()); // [17, 19, 22, 16, 18]

        // getting all the entry
        System.out.println(mp.entrySet()); // [Lav=17, Rishika=19, Varad=22, Yash=16, Harry=18]

        // traversing all the entries from the hash map
        // multiple methods
        // for each
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
            // result
            // Age of Lav is 17
            // Age of Rishika is 19
            // Age of Varad is 22
            // Age of Yash is 16
            // Age of Harry is 18
        }

        // by entries

        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d \n", e.getKey(), e.getValue());
            // result
            // Age of Lav is 17
            // Age of Rishika is 19
            // Age of Varad is 22
            // Age of Yash is 16
            // Age of Harry is 18
        }
        // simpler syntax

        for (var e : mp.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
            // result
            // Lav 17
            // Rishika 19
            // Varad 22
            // Yash 16
            // Harry 18

        }

    }

    public static void main(String[] args) {
        HashMapMethods();

    }
}

//important features of hash map
//=>
//to access the value key have to be know
//hash map does not allow duplicate key
// it can allow duplicate values 
//hash map maintain no order 

// application of hash map 
//=>
//problem related to frequency
//mapping problem
//storage optimization
//dictionary
//phonw books


