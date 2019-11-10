package com.aukusto;

public class Pow {

    public static long powByCumulatedProduct(long x, long n) {

        long y = 1;
        for (int i = 0; i < n; i++) {
            y = y * x;
        }

        return y;
    }

    public static long powByAndShrOperators(long x, long n) {
        //"and" operator. Compare bit by bit on the binary representation of the
        // two integers considered and, return 1 if the two bits are 1 or 0 in
        // any other case
        // Example: 7 & 4 = 0b111 & 0b100 = 100 = 4

        //"shr" shift rigth operator. Shifts, in a binary representation, all
        // digits one position to the right.
        // Example: shr 235 = Ob11101011 >>> 1 = 0b01110101 = 117

        long y = 1L;
        long z = x;

        do {
            if ((n & 1) != 0) {
                y = y * z;
            }

            z = z * z;
            n = n >>> 1;
        } while(n != 0);
        return y;
    }
}
