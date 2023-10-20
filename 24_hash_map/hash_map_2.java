import java.nio.Buffer;
import java.util.*;
//internal working of hashing

//for addition , insertion , searching , contains , retrival it takes o(1);

//hashing means => converting the arbitary size key into the hash-key (small size key);
//function which is use for hashing is called hash function

///perfect hash function always produces unique output for unique input
//in non-perfect hash function collision may be happens 
//collision => multiple input produces same output

//implimenting the hash table

// ==========================================================

//generaaly use hash functions 
//1)division methods =>

//2)mid square methods => if a = 16 --> 16*16 = 256 => 25 ( getting middle values)

//3) digit folding methods => first we divide the dgits into segments of seprete size
//like => a=  1235 ===> (12 +34 + 5)% 10 = 1 //10 is the tablw size

// 4) multiplication methods => first we choose a constant value a 
// then a  * k // k then key
//then  extract the fractional parts of a*k 
// then multiply it by table size 

// ===========================================================
//collisions 
//has functions gives same output for fifferent key values calles collisions 
//like 20 % 9 = 2
// 29 % 9 = 2

// ==================================================================
//collision resolving techniques
// 1=>chaining 
// 2=> open addressing 

// --------------------------------------------
//1) in chaining we keep the multiple entry in the one slot .. but we treat it like linked list

//for putting value
// in chaining hashfunction --> gives bucketIdx (bi)
// bucket[bi] --> traverse this ll and see if key already exist or not 
// if yes --> update the value of key 
//else --> add new node 

// for getting the value 
// in ll we compare the key , if we  get key then perticular value will be return 
//else null will be return 

// removing is same as a ll

// the complexity will change 
//for making the time complexity constants 
//we want more number of buckets 
// then avarage number of key node in one buckets will be decrease
// for that we double the arrays size
//but when we do the size of arrys will double 
//so there is the one term load factor 
//measure that decides when to double the factore 
//in java load factor is 75% of capacity 
// threshold value = load factore * capacity 
// threshold value is the acceptable entries 
// when the suze of array will double then the re hash is done 

//==============================================================
//collision resolving techniques
// 1=>chaining 
// 2=> open addressing 
// ----------------------------------------------------
// 2) open addressing 
// in this if we get the same index for the two key then the second key will be placed in the next bucket
//formula id -> h(k) + i
//where h(k) is the hash value and the i is the no of  attemptains 
// it is like linear probing 
//quadratic probing is similar but in this jumps are of i^2
// in double hashing we make new hash function 

public class hash_map_2 {

    // implimenting hash functions
    // it is the data structure
    static class MyHashMap<k, v> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class node {
            k key;
            v value;

            node(k key, v value) {
                this.key = key;
                this.value = value;

            }
        }

        private int n;
        private LinkedList<node>[] buckets;

        public int size() { // which returns no of entries in map
            return n;
        }

        private void initBuckets(int N) { // N is capacity / size of buckets arrays
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>(); // initialized the empty LL
            }
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        // hash function

        private int HashFun(k key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        // search fun
        // traverses the LL and looks for the node with key if found is return udx
        // otherwise it return null

        private int searchInBuckets(LinkedList<node> ll, k key) {

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }

            }
            return -1;
        }

        // rehash method
        private void reHash() {
            LinkedList<node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;

            for (var bucket : oldBuckets) {
                for (var node : bucket) {
                    put(node.key, node.value);
                }
            }

        }

        // getting bucket size
        public int capacity() {
            return buckets.length;
        }

        // getting load factor
        public float load() {
            return (n * 1.0f) / buckets.length;
        }

        public void put(k key, v value) { // insert and update
            int bi = HashFun(key);

            LinkedList<node> currBucket = buckets[bi];
            int ei = searchInBuckets(currBucket, key);

            if (ei == -1) { // key doesnt exist , we have to insert the nre node
                node node = new node(key, value);
                currBucket.add(node);
                n++;

            } else { // means updating case
                node currNode = currBucket.get(ei);
                currNode.value = value;

            }

            if (n >= buckets.length * DEFAULT_LOAD_FACTOR) {
                reHash();
            }

        }

        public v get(k key) {
            int bi = HashFun(key);
            LinkedList<node> currBucket = buckets[bi];
            int ei = searchInBuckets(currBucket, key);

            if (ei != -1) { // key exist
                node currnode = currBucket.get(ei);
                return currnode.value;
            }

            return null; // if not exist;

        }

        public v remove(k key) {
            int bi = HashFun(key);
            LinkedList<node> currBucket = buckets[bi];
            int ei = searchInBuckets(currBucket, key);
            if (ei != -1) { // key exist
                node currNode = currBucket.get(ei);
                v val = currNode.value;
                currBucket.remove(ei);
                n--;

                return val;

            }
            return null;

        }

    }

    public static void main(String[] args) {

        MyHashMap<String, Integer> mp = new MyHashMap<>();

        System.out.println("testint put");
        mp.put("a", 1);
        mp.put("b", 2);

        System.out.println(mp.capacity()); //4
        System.out.println(mp.load()); //0.5
        mp.put("c", 3);
        System.out.println(mp.get("a"));// 1
        System.out.println(mp.get("b"));// 2
        System.out.println(mp.get("c"));// 3

        System.out.println("testing size " + mp.size()); // 3
        mp.put("c", 30);

        System.out.println("testing size " + mp.size());// 3
        System.out.println("testing get");
        System.out.println(mp.get("a"));// 1
        System.out.println(mp.get("b"));// 2
        System.out.println(mp.get("c"));// 3 updated
        System.out.println(mp.get("vrd")); // null

        System.out.println(mp.remove("c")); // 30
        System.out.println(mp.remove("c")); // null => becaused already removed

        mp.put("x", 45);
        mp.put("y", 71);
        mp.put("z", 51);
        System.out.println("testing size " + mp.size()); // 5

        System.out.println(mp.get("x"));// 45
        System.out.println(mp.get("y"));// 71
        System.out.println(mp.get("z"));// 51

        System.out.println(mp.capacity());//8
        System.out.println(mp.load()); //0.625

    }
}
