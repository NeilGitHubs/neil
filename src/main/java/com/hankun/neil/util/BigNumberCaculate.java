package com.hankun.neil.util;

/**
 * XY = ac*10^(n+m)/2+ad*10^n/2+bc*10^m/2+bd
 */
public class BigNumberCaculate {

    public static int sign(long a) {
        return a < 0 ? -1 : 1;
    }
    public static double multiplyV1(long x,long y,int n) {
        x = Math.abs(x);
        y = Math.abs(y);
        if (n == 1) {
            return x * y;
        }
        else {
            if (n%2==1) {
                n = n - 1; //对奇数的操作
            }
            long a = x / Math.round(Math.pow( 10 , (n / 2)));
            long b = x - a * Math.round(Math.pow( 10 , (n / 2)));
            long c = y / Math.round(Math.pow( 10 , (n / 2)));
            long d = y - c * Math.round(Math.pow( 10 , (n / 2)));
            double ac = multiplyV1(a,c,n/2);//递归计算a*c
            double bd = multiplyV1(b,d,n/2);//计算b*d
            long aJb = a + b;
            long cJd = c + d;
            double abcd = multiplyV1(aJb,cJd,n/2);
            return (ac*Math.pow(10,n) + (abcd - ac - bd)*Math.pow(10,n/2) +bd);
        }
    }

    public static void main(String[] args) {
        long x = 4524L;
        long y = 4L;
        String sx = String.valueOf(x);
        int n = sx.length();
        long sig = sign(x)*sign(y);
        double s = multiplyV1(x,y,n);
        System.out.println("大数相乘的计算结果为："+s*sig);
    }


    public static String addBinary(String a, String b) {
        int carry = 0;
        int sum = 0;
        int opa = 0;
        int opb = 0;
        StringBuilder result = new StringBuilder();
        // 量字符串补齐位数
        while (a.length() != b.length()) {
            if (a.length() > b.length()) {
                b = "0" + b;
            } else {
                a = "0" + a;
            }
        }
        for (int i = a.length() - 1; i >= 0; i--) {
            opa = a.charAt(i) - '0';
            opb = b.charAt(i) - '0';
            sum = opa + opb + carry;
            if (sum >= 2) {
                result.append((char) (sum - 2 + '0'));
                carry = 1;
            } else {
                result.append((char) (sum + '0'));
                carry = 0;
            }

        }
        if (carry == 1) {
            result.append("1");
        }
        return result.reverse().toString();
    }
}