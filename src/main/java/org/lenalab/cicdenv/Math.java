package org.lenalab.cicdenv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Math {
    private int num1;
    private int num2;

    public int sum() {
        return num1+num2;
    }

}
