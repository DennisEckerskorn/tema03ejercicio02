package com.denniseckerskorn.tema03ejercicio02.modelos;

import java.math.BigInteger;

public class MathUtils {

    /**
     * Method to calculate the factorial of a number.
     * @param num integer
     * @return factorial of the given number
     */
    public static long factorial(int num) {
        long result = 1;
        for(int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
