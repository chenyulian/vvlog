package com.ylchen.vvlog.utils;

import org.apache.commons.codec.binary.Base64;

import java.security.MessageDigest;

/**
 * 对字符串进行md5加密
 */
public class MD5Utils {
    public static String getMD5Str(String str) throws Exception{
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        String resultStr = Base64.encodeBase64String(messageDigest.digest(str.getBytes()));
        return resultStr;
    }

    public static void main(String args[]){
        try{
            String md5 = getMD5Str("teststr");
            System.out.println(md5);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
