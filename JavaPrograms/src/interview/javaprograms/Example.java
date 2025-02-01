package interview.javaprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
        //most repeated palindrome
        String s="mom dad mom dad children dad";
        String[] s1=s.split(" ");
        int maxcount=0;
        String repeated="";
        LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
        //count word frquencies and identify palindrome
        for(int i=0;i<s1.length;i++){
            //count the frequency of each word
        	String temp = s1[i];
            if(map.containsKey(temp)){
                map.put(s1[i],map.get(temp)+1);
            }
                    else{
                        map.put(s1[1],1);
                    }
        //check if the word is a palindrome
        String rev=new StringBuilder(s1[i]).reverse().toString();
        if(rev.equals(s1[i])){
            System.out.println("palindrome  " +rev);
            
        }
                    
    }
    //find the most repeated palindrome
    for(Map.Entry<String,Integer>entry:map.entrySet()){
        String key =entry.getKey();
        int value=entry.getValue();
        
        //check if the key is a palindrome and its count is the highest
        String rev=new StringBuilder(key).reverse().toString();
        if(rev.equals(key)&&value>maxcount){
        	maxcount=value;
            repeated=key;	        }
    }
    //print the most repeated palindrome
      System.out.print(repeated);
    
            }
        }