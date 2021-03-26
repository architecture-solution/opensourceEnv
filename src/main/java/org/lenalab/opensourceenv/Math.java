package org.lenalab.opensourceenv;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Math {
    private int num1;
    private int num2;

    public int sum() {
        return num1+num2;
    }

}
