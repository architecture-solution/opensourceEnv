package org.lenalab.cicdenv;

import org.junit.Test;

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
}