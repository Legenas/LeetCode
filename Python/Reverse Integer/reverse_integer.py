class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        flag = 0
        if x < 0:
            flag = 1
            x = abs(x)
            
        x1 = int(str(x)[::-1])
        if flag == 1:
            x1 = -1 * x1
            
        if x1<(-2**31) or x1>(2**31):
            x1=0  
        
        return x1