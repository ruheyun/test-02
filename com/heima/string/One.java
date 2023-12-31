package com.heima.string;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入7位以内数字：");
        int num;
        while (true){
            num = sc.nextInt();
            if (num >= 0 && num <= 9999999){
                break;
            }else {
                System.out.println("输入错误，请重新输入：");
            }
        }
        String bigNum = "";
        while (true){
            int ge = num % 10;
            num = num / 10;
            bigNum = reverse(ge) + bigNum;
            if (num == 0){
                break;
            }
        }
        while (bigNum.length() < 7){
            bigNum = "零" + bigNum;
        }
        String []str = {"佰","拾","万","仟","佰","拾","元"};
        String result = "";
        for (int i = 0; i < 7; i++) {
            result = result + bigNum.charAt(i) + str[i];
        }
        System.out.println(result);
    }

    public static String reverse(int n){
        String[] str = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return str[n];
    }
}
