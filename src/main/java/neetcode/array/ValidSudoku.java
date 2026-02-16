package neetcode.array;

import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        
        if(board.length != 9 || board[0].length != 9) {
            return false;
        }


        for (int i = 0; i < board.length; i++) {
            if(hasDuplicate(convertToNumbers(board[i]))) {
                return false;
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            char[] chars = new char[board[0].length];
            for(int j = 0; j < board[0].length; j++) {
                chars[j] = board[j][i];
            }
            if(hasDuplicate(convertToNumbers(chars))) {
                return false;
            }
        }

        int row = 0;
        int column = 0;
        while(row < 9) {
            while (column < 9) {
                char[] chars = new char[9];
                int count = 0;
                for(int i = row; i < row + 3; i++) {
                    for(int j = column; j < column + 3; j++) {
                        chars[count++] = board[i][j];
                    }
                }
                if(hasDuplicate(convertToNumbers(chars))){
                    return false;
                }
                column += 3;
            }
            row += 3;
            column = 0;
        }
        return true;
    }

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(num != 0 && set.contains(num)) {
               return true;    
            }
            set.add(num);
        }
        return false;
    }

    public int[] convertToNumbers(char[] chars) {
        int[] nums = new int[chars.length];

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '.') {
                nums[i] = 0;
            } else {
                nums[i] = chars[i] - '0';
            }   
        }
        return nums;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        ValidSudoku validSudoku = new ValidSudoku();
        System.out.println(validSudoku.isValidSudoku(board));
    }
}
