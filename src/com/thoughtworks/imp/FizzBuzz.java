package com.thoughtworks.imp;

import javax.naming.ldap.SortResponseControl;

public class FizzBuzz {
    public static String execute(int i) {
        StringBuffer result = new StringBuffer();
        if (i % 3 == 0) {
            result.append("Fizz");
            if (i % 5 == 0) {
                result.append("Buzz");
                if (i % 7 == 0) {
                    result.append("Whizz");
                }
            }else if (i % 7 == 0){
                result.append("Whizz");
            }
        } else if (i % 5 == 0) {
            result.append("Buzz");
            if (i % 7 == 0) {
                result.append("Whizz");
            }
        } else if (i % 7 == 0) {
            result.append("Whizz");
        } else {
            result.append(String.valueOf(i));
        }
        return result.toString();
    }

    public String say(int i){
        StringBuffer result = new StringBuffer();
        String temp = String.valueOf(i);
        if(temp.contains("3")){
            return result.append("Fizz").toString();
        }else if (temp.contains("5")){
            return result.append("Buzz").toString();
        }else if(temp.contains("7")){
            return result.append("Whizz").toString();
        }else {
            return this.execute(i);
        }
    }

}
