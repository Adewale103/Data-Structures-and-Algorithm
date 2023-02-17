package leet_code_solutions;

import java.util.*;

public class WordBreak2 {
    public static void main(String[] args) {
        HashSet<String> dict = new HashSet<String>();
        dict.add("go");
        dict.add("goal");
        dict.add("goals");
        dict.add("special");
        String word = "goalssetter";
        List<String> result = wordBreak(word, dict);
        for (String s : result) {
            System.out.println(s);
        }


    }
    public static List<String> wordBreak(String s, Set<String> dict) {
//create an array of ArrayList<String>
        List<String>[] dp = new ArrayList[s.length()+1];
        dp[0] = new ArrayList<String>();
        for(int i=0; i<s.length(); i++){
            if( dp[i] == null )
                continue;
            for(String word:dict){
                int len = word.length();
                int end = i+len;
                if(end > s.length())
                    continue;
                if(s.substring(i,end).equals(word)){
                    if(dp[end] == null){
                        dp[end] = new ArrayList<>();
                    }
                    dp[end].add(word);
                }
            }
        }
        List<String> result = new LinkedList<String>();
        if(dp[s.length()] == null) return result;
        ArrayList<String> temp = new ArrayList<String>();
        dfs(dp, s.length(), result, temp);
        return result;
    }
    public static void dfs(List<String> dp[],int end,List<String> result,
                           ArrayList<String> tmp){
        if(end <= 0){
            StringBuilder path = new StringBuilder(tmp.get(tmp.size() - 1));
            for(int i=tmp.size()-2; i>=0; i--){
                path.append(" ").append(tmp.get(i));
            }
            result.add(path.toString());
            return;
        }
        for(String str : dp[end]){
            tmp.add(str);
            dfs(dp, end-str.length(), result, tmp);
            tmp.remove(tmp.size()-1);
        }
    }

}
