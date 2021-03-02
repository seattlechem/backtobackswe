class Solution {
    public boolean isPalindrome(int x) {
      if (x < 0) {
        return false;
      }

      int numOfDigit = (int)(Math.log10(x)) + 1;
      int mask = (int)(Math.pow(10, numOfDigit - 1));

      for(int i = 0; i < numOfDigit/2; i++) {
        int first = x / mask;
        int last = x % 10;

        if (first != last) {
          return false;
        }

        x %= mask;
        x /= 10;
        mask /= 100;
      }

      return true;
    }
  }
