class ReverseInteger {
    public int reverse(int x) {
        long temp = x;
        // 先取绝对值
        if(x < 0){
            temp = -temp;
        }
        
        // 判断有几位
        int i = 0;
        while(temp/10 > 0){
            i++;
            temp/=10;
        }
        
        // 翻转
        long reverse = 0;
        while(i >=0 ){
            reverse += Math.pow(10,i) * (x % 10);
            x = x / 10;
            i--;
        }
        
        // 判断越界与否
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        
        return (int)reverse;
    }
}