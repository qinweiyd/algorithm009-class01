class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int j = i, q = Math.min(i + k - 1, s.length() - 1);
            while (j < q) {
                char temp = arr[j];
                arr[j++] = arr[q];
                arr[q--] = temp;
            }
        }
        return String.valueOf(arr);
    }
}