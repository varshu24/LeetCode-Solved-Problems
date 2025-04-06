class Solution {
    public int romanToInt(String s) {
        
        char[] symbols = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] values = {1, 5, 10, 50, 100, 500, 1000};

        int sum = 0;
        
        
        for (int i = 0; i < s.length(); i++) {
            char currentSymbol = s.charAt(i);
            int currentValue = 0;

            
            for (int j = 0; j < symbols.length; j++) {
                if (currentSymbol == symbols[j]) {
                    currentValue = values[j];
                    break;
                }
            }
            
            
            if (i + 1 < s.length()) {
                char nextSymbol = s.charAt(i + 1);
                int nextValue = 0;
                
                
                for (int j = 0; j < symbols.length; j++) {
                    if (nextSymbol == symbols[j]) {
                        nextValue = values[j];
                        break;
                    }
                }
                
    
                if (nextValue > currentValue) {
                    sum -= currentValue;
                } else {
                    sum += currentValue;
                }
            } else {
                
                sum += currentValue;
            }
        }
        
        return sum;
    }
}






    
