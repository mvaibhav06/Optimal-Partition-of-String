import java.util.HashSet;
import java.util.Set;

public class OptimalPartition {
    public int partitionString(String s) {
        int out = 0;
        Set<Character> temp = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(temp.contains(ch)){
                out++;
                temp.clear();
            }
            temp.add(ch);
        }
        return out+1;
    }
}
