class ShufflingString {
    public String restoreString(String s, int[] indices) {
    char newArray[] = new char[s.length()];
        for(int i=0;i<indices.length;i++)
        {
            newArray[indices[i]] = s.charAt(i);
        }
    return String.valueOf(newArray);
    }
}