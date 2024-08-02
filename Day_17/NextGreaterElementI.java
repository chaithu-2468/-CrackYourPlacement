class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Finding Nexg greater element forms nums2 array
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        int[] nextGreater = new int[n];
        
        nextGreater[n-1] = -1;
        st.push(nums2[n-1]);
        for(int i=n-2 ; i>=0 ; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i])   st.pop();

            if(st.isEmpty())    nextGreater[i] = -1;
            else                nextGreater[i] = st.peek();

            st.push(nums2[i]);
        } 

        // for(int ele : nextGreater){
        //     System.out.print(ele +" ");
        // }

        // hash map of(ele and nextgreater ele)
        // copy to nums1 nextgreater ele
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i<nums2.length ; i++){
            map.put(nums2[i] , nextGreater[i]);
        }

        int[] ans = new int[nums1.length];
        for(int i=0 ; i<nums1.length ; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}