import java.util.HashMap;

public class Problem1 {
	
	// Did Run on leetcode
	//m = length of t and n = length of s
	// time : O(m+n)
	//Space :O(m)
	 public String customSortString(String S, String T) {
	        
	        HashMap<Character,Integer> map = new HashMap<>();
	        for(char c : T.toCharArray()){
	            map.put(c,map.getOrDefault(c,0)+1);
	        }
	        StringBuilder sb = new StringBuilder();
	        for(char c: S.toCharArray()){           
	            if(map.containsKey(c)){                
	                while(map.get(c)>0){
	                sb.append(c);
	                map.put(c,map.getOrDefault(c,0)-1);
	                }
	            }
	        }
	              
	       for(char c: map.keySet()){  
	           if(map.get(c)==0){
	                continue;
	            }
	            while(map.get(c)>0){
	                sb.append(c);
	                map.put(c,map.getOrDefault(c,0)-1);
	            }
	           
	       }
	        return sb.toString();
	    }
}
