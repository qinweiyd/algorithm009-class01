class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dic = new HashSet<String>(wordList);
        if (!dic.contains(endWord)) return 0;
        Set<String> beginSet = new HashSet<String>();
        Set<String> endSet = new HashSet<String>();
        int count = 1;
        beginSet.add(beginWord);
        endSet.add(endWord);
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            if (beginSet.size() > endSet.size()) {
                Set set = beginSet;
                beginSet = endSet;
                endSet = set;
            }
            Set<String> tempSet = new HashSet<String>();
            for (String word : beginSet) {
                char[] arr = word.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    char temp = arr[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        arr[i] = c;
                        String newWord = String.valueOf(arr);
                        if (endSet.contains(newWord)) return count + 1;
                        if (dic.contains(newWord)) {
                            dic.remove(newWord);
                            tempSet.add(newWord);
                        }
                    }
                    arr[i] = temp;
                }
            }
            beginSet = tempSet;
            count++;
        }
        return 0;
    }
}