class Solution {
    public int balancedStringSplit(String s) {
        int count=0,result=0;
        for(int i=0;i < s.length();i++)
        {
            char current;
            current = s.charAt(i);
        if(current == 'L')
            count++;
     if(current == 'R')
            count--;
        if(count ==0)
            result++;
    }
        return result;
}
}