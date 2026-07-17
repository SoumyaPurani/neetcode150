class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>(); //creating a hashmap

        for(String s : strs){ //getting a string
            char[] chararr = s.toCharArray(); //convering it to a char array
            Arrays.sort(chararr); //sorting the char array
            String sorteds = new String(chararr); //converting sorted char array into a String so it can be used as a key in Hashmap
            result.putIfAbsent(sorteds, new ArrayList<>()); //Inserting the strings as a key in into hashmap if absent
            result.get(sorteds).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
