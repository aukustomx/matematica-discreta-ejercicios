package com.aukusto;

import org.junit.Assert;
import org.junit.Test;

public class PowTest {

    @Test
    public void powByCumulatedProduct() {
        long n = 1000000000L;
        long start = System.currentTimeMillis();
        Assert.assertEquals(9215150800219179009L, Pow.powByCumulatedProduct(3, n));
        System.out.println("powByCumulatedProduct time: " + (System.currentTimeMillis() - start));
    }

    @Test
    public void powByAndShrOperators() {
        long n = 1000000000L;
        long start = System.currentTimeMillis();
        Assert.assertEquals(9215150800219179009L, Pow.powByAndShrOperators(3, n));
        System.out.println("powByAndShrOperators time: " + (System.currentTimeMillis() - start));
    }
}