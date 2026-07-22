class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        char[] chararr = str.toCharArray();
        List<String> decoded = new ArrayList<>();
        
        int i = 0;
        while (i < chararr.length) {
            int j = i;
            while (chararr[j] != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            
            String element = str.substring(i, i + length);
            decoded.add(element);
            i += length;
        }
        return decoded;
    }
}
