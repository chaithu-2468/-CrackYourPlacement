
//User function Template for Java

class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        Collections.sort(arr);
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] inc = new boolean[n];
        
        helper(arr , temp , ans , inc);
        
        return ans;
    }
    
    public static void helper(ArrayList<Integer> arr ,ArrayList<Integer> temp , ArrayList<ArrayList<Integer>> ans ,boolean[] inc){
        if(temp.size() == arr.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0 ; i<arr.size() ; i++){
            if(inc[i] || i>0 && arr.get(i).equals(arr.get(i-1)) && inc[i-1]){
                continue;
            }
            
            inc[i] = true;
            temp.add(arr.get(i));
            helper(arr , temp , ans , inc);
            
            temp.remove(temp.size()-1);
            inc[i]=false;
        }
    }
};