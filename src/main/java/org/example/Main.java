package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println( isPalindrome(-1221));
        System.out.println( isPalindrome(707));
        System.out.println( isPalindrome(11212));

        System.out.println("-----------------------------");

        System.out.println( isPerfectNumber(6));
        System.out.println( isPerfectNumber(28));
        System.out.println( isPerfectNumber(5));
        System.out.println( isPerfectNumber(-1));

        System.out.println("-----------------------------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int num){
        num = Math.abs(num);
       String strNum = String.valueOf(num);
       String reverseStrNum = new StringBuilder(strNum).reverse().toString();
       return reverseStrNum.equals(strNum);
    }

    public static boolean isPerfectNumber(int num){
        num = Math.abs(num);
        if(num == 1){
            return false;
        }
        int sum = 1;

        for(int i= 2; i < num; i++){
            if(num%i==0){
                sum += i;
            }
        }

        return sum == num;
    }

    public static String numberToWords(int num){
        if(num < 0){
            return "Invalid Value";
        }
        String strNum = String.valueOf(num);
        String[] strArr = strNum.split("");
        String result = "";
        for (String n: strArr) {
            switch (n){
                case "0":
                    result += "Zero ";
                    break;
                case "1":
                    result += "One ";
                    break;
                case "2":
                    result += "Two ";
                    break;
                case "3":
                    result += "Three ";
                    break;
                case "4":
                    result += "Four ";
                    break;
                case "5":
                    result += "Five ";
                    break;
                case "6":
                    result += "Six ";
                    break;
                case "7":
                    result += "Seven ";
                    break;
                case "8":
                    result += "Eight ";
                    break;
                case "9":
                    result += "Nine ";
                    break;
            }
        }

        return result.trim();
    }
}
