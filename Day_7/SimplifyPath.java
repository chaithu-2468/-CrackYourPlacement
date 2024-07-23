class Solution {
    public String simplifyPath(String s) {
        String[] arr = s.split("/");
        Stack<String> st = new Stack<>();

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i].isEmpty())    continue;
            if(arr[i].equals("..") && !st.isEmpty()) st.pop();
            else if(arr[i].equals(".") || arr[i].equals("/")) continue;
            else if(!arr[i].equals(".") && !arr[i].equals("..") ) st.push(arr[i]);  
        }

        if(st.isEmpty())    return "/";

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop()).insert(0, "/");
        }

        return sb.toString();
    }
}