class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman_value = [1, 5, 10, 50, 100, 500, 1000]
        roman_symbol = 'IVXLCDM'
        result_arr = []
        result = 0
        
        for i in range(len(s)):
            for j in range(len(roman_symbol)):
                if s[i] == roman_symbol[j]:
                    result_arr.append(roman_value[j])
                    break;
        i = 0
        while i<len(result_arr)-1:
            if result_arr[i] >= result_arr[i+1]:
                result += result_arr[i]
                i += 1
            else:
                result += result_arr[i+1] - result_arr[i]
                i += 2
        if i != len(result_arr):
            result += result_arr[-1]
        
        return result
        