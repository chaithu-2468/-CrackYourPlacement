class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        helper(n , 0 , 0 , "",list);
        return list;
    }

    public void helper(int n , int o , int c ,String s , List<String> list){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(o<n) helper(n , o+1 , c , s+"(" , list);
        if(c<o) helper(n , o , c+1 , s+")" , list);
    }



}


// Time Complexity Optimized

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        helper(0 , 0 , n , new StringBuilder() , ans);

        return ans;
    }

    public static void helper(int open , int closed , int n , StringBuilder sb , List<String> ans){
        if(sb.length() == 2*n){
            ans.add(sb.toString());
            return ;
        }

        if(open < n){
            sb.append("(");
            helper(open+1 , closed , n , sb , ans);
            sb.deleteCharAt(sb.length()-1);
        }

        if(closed < open){
            sb.append(")");
            helper(open , closed+1 , n , sb , ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}