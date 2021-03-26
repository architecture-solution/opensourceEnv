package org.lenalab.opensourcenv;

import org.junit.Test;
import org.lenalab.opensourceenv.Math;

import static org.junit.jupiter.api.Assertions.*;

public class MathTest {

    @Test
    public void sumTest() throws Exception {
        //given
        Math math = new Math(1,2);

        //when
        int res = math.sum();

        //then
        assertEquals(3,res);
    }

    @Test
    public void minusTest() throws Exception {
        //given
        Math math = new Math(2,1);

        //when
        int res = math.minus();

        //then
        assertEquals(1,res);
    }
}