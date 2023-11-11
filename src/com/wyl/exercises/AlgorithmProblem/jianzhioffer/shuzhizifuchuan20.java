package com.wyl.exercises.AlgorithmProblem.jianzhioffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class shuzhizifuchuan20 {
            public static boolean isNumber(String s) {
            Map[] states = {
                    new  HashMap<>() {{put(' ',0);put('s',1);put('d',2);put('.',4);}},//状态0为空格，后面可接空格，符号，数字，和小数点
                    new  HashMap<>() {{put('d',2);put('.',4);}},//状态1为e前的符号，可接数字和小数点
                    new  HashMap<>() {{put('d',2);put('.',3);put('e',5);put(' ',8);}},//2
                    new  HashMap<>() {{put('d',3);put('e',5);put(' ',8);}},//3
                    new  HashMap<>() {{put('d',3);}},//4
                    new  HashMap<>() {{put('s',6);put('d',7);}},//5
                    new  HashMap<>() {{put('d',7);}},//6
                    new  HashMap<>() {{put('d',7);put(' ',8);}},//7
                    new  HashMap<>() {{put(' ',8);}},//8
            };
            int p = 0;
            char t = 0;
            for (char c : s.toCharArray()) {
                if (c > '0' && c < '9') t = 'd';
                else if (c == '-' || c == '+') t = 's';
                else if (c == 'E' || c == 'e') t = 'e';
                else if (c == ' ' || c == '.') t = c;
                else t = '?';
            }
            if (!states[p].containsKey(t)) return false;
            p = (int)states[p].get(t);
            return p == 2 || p == 3 || p == 7 || p == 8;
        }

    public static void main(String[] args) {
        System.out.print("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        System.out.println("字符串判断为：" + isNumber(sc.nextLine()));
    }

}
