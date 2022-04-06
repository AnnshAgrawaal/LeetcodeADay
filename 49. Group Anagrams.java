
// Sorting - O(nlog(n))
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for(String s:strs){
            char[] charr = s.toCharArray();
            Arrays.sort(charr);
            String str = String.valueOf(charr);
            if(!hmap.containsKey(str)){
                hmap.put(str,new ArrayList<>());
            }
            
            hmap.get(str).add(s);
        }
        
        return new ArrayList<>(hmap.values());
    }
}


// Hashing Array - O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> hmap = new HashMap<>();
        for(String s: strs){
            char[] charr = new char[26];
            for(char c: s.toCharArray()){
                charr[c-'a']++;
            }
            String str = String.valueOf(charr);
            if(!hmap.containsKey(str)){
                hmap.put(str,new ArrayList<>());
            }
            hmap.get(str).add(s);
        }

        return new ArrayList<>(hmap.values()); 

    }
}