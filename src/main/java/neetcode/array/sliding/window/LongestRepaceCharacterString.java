package neetcode.array.sliding.window;

class LongestRepaceCharacterString {

    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26];
        int left = 0;
        int maxLen = 0;
        int maxCount = 0;

        for (int right = 0; right < s.length(); right++) {
            charCount[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, charCount[s.charAt(right) - 'A']);

            while (right - left + 1 - maxCount > k) {
                charCount[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String input = "XXYYZ";
        int k = 2;
        LongestRepaceCharacterString obj = new LongestRepaceCharacterString();
        System.out.println(obj.characterReplacement(input, k));
    }

}

