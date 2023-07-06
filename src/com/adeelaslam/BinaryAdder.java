package com.adeelaslam;

/**
 * n Bit input variables a and b and the result is n + 1 bits
 */
public class BinaryAdder {

    /**
     * This method can be run standalone in a console application. 
     * 
     
     * @param args multiple string command line arguments can be provided to this method.
     */
    public static void main(String[] args) {
        String A = "0110";
        String B = "1101";

        System.out.println("Binary Sum in n + 1 digits is: " + binaryAdder(A, B));
    }

    public static String binaryAdder(String A, String B) {
        String result = "";
        int carry = 0;
        int bit = 0;
        for (
                int i = A.length() - 1; i >= 0; i--
        ) {
            if (
                carry == 0
            ) {
                if (
                    A.charAt(i) == '0'
                ) {
                    if (
                        B.charAt(i) == '0'
                    ) {
                        bit = 0;
                        carry = 0;
                    } else {
                        bit = 1;
                        carry = 0;
                    }
                } else {
                    if (
                        B.charAt(i) == '0'
                    ) {
                        bit = 1;
                        carry = 0;
                    } else {
                        bit = 0;
                        carry = 1;
                    }
                }
            } else {
                if (
                    A.charAt(i) == '0'
                ) {
                    if (
                        B.charAt(i) == '0'
                    ) {
                        bit = 1;
                        carry = 0;
                    } else {
                        bit = 0;
                        carry = 1;
                    }
                } else {
                    if (
                        B.charAt(i) == '0'
                    ) {
                        bit = 0;
                        carry = 1;
                    } else {
                        bit = 1;
                        carry = 1;
                    }
                }

            }
            result = String.valueOf(bit) + result;
        }
        result = String.valueOf(carry) + result;
        return result;
    }

}
