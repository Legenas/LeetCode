class RomanToInteger {
    public int romanToInt(String s) {
        int length = s.length();
        int retNum = 0;
        for(int i=0;i<length;i++){
            switch(s.charAt(i)){
                case 'I':{
                    if(i+1<length){
                        if(s.charAt(i+1)=='V'){
                            retNum += 4;
                            i++;
                            continue;
                        }
                        if(s.charAt(i+1)=='X'){
                            retNum += 9;
                            i++;
                            continue;
                        }
                        retNum += 1;
                    }
                    break;
                }
                case 'X':{
                    if(i+1<length){
                        if(s.charAt(i+1)=='L'){
                            retNum += 40;
                            i++;
                            continue;
                        }
                        if(s.charAt(i+1)=='C'){
                            retNum += 90;
                            i++;
                            continue;
                        }
                        retNum += 10;
                    }
                    break;
                }
                case 'C':{
                    if(i+1<length){
                        if(s.charAt(i+1)=='D'){
                            retNum += 400;
                            i++;
                            continue;
                        }
                        if(s.charAt(i+1)=='M'){
                            retNum += 900;
                            i++;
                            continue;
                        }
                        retNum += 10;
                    }
                    break;
                }
                case 'V':{
                    retNum += 5;
                    break;
                }
                case 'L':{
                    retNum += 50;
                    break;
                }
                case 'D':{
                    retNum += 500;
                    break;
                }
                case 'M':{
                    retNum += 1000;
                    break;
                }
            }
        }
        return retNum;
    }
}