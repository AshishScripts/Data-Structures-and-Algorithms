package arrays_and_hashing;

import  java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*

A HashMap in Java is a data structure used to store data in key–value pairs.

Each key is unique
Values can be duplicate
Internally, it uses a hashing mechanism (fast lookup)


It gives very fast operations (average case):

Insert → O(1)
Search → O(1)
Delete → O(1)


How It Works (Conceptually)

Key is passed to a hash function
Hash function converts it into an index
Value is stored at that index

Syntax:
import java.util.HashMap;
HashMap<KeyType, ValueType> map = new HashMap<>();

Important   Points:-
Allows one null key, multiple null values
Not ordered (no guarantee of insertion order)
Not thread-safe
*/

public class HashMapImplementation {
public static void main(String[] args) {
    HashMap<String  , Integer>  map=new HashMap<>();

    //Inserting values

    //Case1:    if  key already exists  then    update  the value
    //case2:    if  key doesnt  exists  then    add new key value   pair

    map.put("apple",10);
    map.put("Mango",20);
    map.put(null, null);
    map.put("apple",5);

    System.out.println(map);

    //checking  size
    System.out.println(map.size());

    //Searching or  checking    the existence   or  lookup
    if(map.containsKey("apple")){   //retruns   true    or  false
        System.out.println("key Exists");
    }else{
        System.out.println("key not found");
    }

    if(map.containsValue(5)){
        System.out.println("value   found");
    }else{
        System.out.println("Doesnt  exists");
    }

    //Getting   values  using   jkeys
   System.out.println( map.get("apple"));//if  key exists  value   is returned
   System.out.println( map.get("litchi"));//if  key doesnt  exists  then    null

   //iterating  the map
   //foreach    in  an  array :  for(int    num :   arr){   }

   for(Map.Entry<String,Integer>    e   :   map.entrySet()){
    //Map.Entry<String,Integer> is  type    equivalent  like    int
        System.out.println(e.getKey()   +  ":" + e.getValue());
    }

    //Method    2
    System.out.println("\nmethod  2");
    Set<String>  keys=map.keySet();
    for(String  key  :   keys){
        System.out.println(key + ":"  + map.get(key));
    }
}
}
