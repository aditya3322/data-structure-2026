package neetcode.array.sliding.window;

import java.util.*;

class DNASequences {

    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) {
            return Collections.emptyList();
        }
        Set seen = new HashSet(), repeated = new HashSet();
        for (int i = 0; i + 9 < s.length(); i++) {
            String ten = s.substring(i, i + 10);
            if (!seen.add(ten))
                repeated.add(ten);
        }
        return new ArrayList(repeated);
    }

    public int dnaSeqSum(String s) {
        int total = 0;
        for (char c :  s.toCharArray()) {
            total += (int)c;
        }
        return total;
    }

    public static void main(String[] args) {
        String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        DNASequences dnaSequences = new DNASequences();
        System.out.println(dnaSequences.findRepeatedDnaSequences(input));
    }
}