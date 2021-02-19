package com.vtest.it.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Roshan.Huang
 * @date 2021/02/19  14:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProbeMappingInformation implements Serializable {
    private static final long serialVersionUID = 4151620250499435980L;
    private String testStartTime;
    private String testEndTime;
    private String grossDie;
    private String passDie;
    private String waferYield;
    private String testTime;
    private String indexSizeX;
    private String indexSizeY;
    private String col;
    private String row;
    private String notch;
    private String waferSize;
    private String slot;
    private String minX;
    private String minY;
    private String maxX;
    private String maxY;
    private String testDieMinX;
    private String testDieMinY;
    private String testDieMaxX;
    private String testDieMaxY;
}
