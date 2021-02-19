package com.vtest.it.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author Roshan.Huang
 * @date 2021/02/19  14:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MappingInitInformationBean implements Serializable {
    private static final long serialVersionUID = 1815720579447407060L;
    private String waferId;
    private String cpStep;
    private String sourceBase;
    private String operator;
    private List<ProbeMappingInformation> list;
}
