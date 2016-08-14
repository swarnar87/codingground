

public class HelloWorld<K,V>{

Entry[] entryList ;


public HelloWorld()
{
 entryList= new Entry[10] ;
}

public void put(K key, V value)
{
    
    int bucket =0;
    if(key!=null)
    {
        bucket = 1 ;
    }
    if (entryList[bucket] == null)
    {
    entryList[bucket] = new Entry(key,value,null);
    }
    else
    entryList[bucket].setNext(new Entry(key,value,null));
    
}

public V get(K key)
{
    
}
     public static void main(String []args){
         
         HelloWorld<String, String> h = new HelloWorld<String, String>();
         h.put("Swarna" , "sharath");
        System.out.println("Hello World");
     }
}
