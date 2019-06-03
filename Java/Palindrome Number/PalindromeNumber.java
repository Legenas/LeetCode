class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // check if x is negative
        if(x < 0){
            return false;
        }
        
        if(x/10 < 1){
            return true;
        }
        
        // if x is positive
        int temp = x, i = 0;
        while(temp/10 > 0){
            i++;
            temp = temp/10;
        }
        
        int y;
        for(int j=i;j>0;j-=2){
            y = new Double(Math.pow(10,j)).intValue();
            if(x/y == x%10){
                x = (x-(x/y)*y)/10;
                continue;
            }else{
                return false;
            }
        }
        
        return true;
        
    }

    public boolean isPalindrome2(int x) {
        // check if x is negative
        if(x < 0){
            return false;
        }
        
        if(x/10 < 1){
            return true;
        }
        
        // if x is positive
        List arr = new ArrayList<Integer>();
        while(x/10 > 0){
            arr.add(x % 10);
            x = x / 10;
        }
        arr.add(x);
        
        int num = arr.size();
        for(int j=0;j<num/2;j++){
            if(arr.get(j).equals(arr.get(num-1-j))){
                continue;
            }else{
                return false;
            }
        }
        
        return true;
        
    }
}