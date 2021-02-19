package com.vtest.it.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Roshan.Huang
 * @date 2021/02/19  14:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDieBean implements Serializable {
    private static final long serialVersionUID = -4432879984630950035L;
    private String h;
    private String s;
    private String t;
    private String x;
    private String y;
    private String o;
}
