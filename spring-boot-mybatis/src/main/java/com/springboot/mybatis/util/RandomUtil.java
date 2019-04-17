package com.springboot.mybatis.util;

public class RandomUtil {
    public static String getRandomCode() {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i =0;i<6;i++){
//            生成【0，bound】
            int num = random.nextInt(bound:10);
            stringBuffer.append(num);
        }
        return stringBuffer.toString();
    }
}
