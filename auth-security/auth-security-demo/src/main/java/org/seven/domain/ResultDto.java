package org.seven.domain;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

/**
 * 返回通用格式
 *
 * @author Seven.Lin
 * @date 2020/1/8 18:31
 */
@Data
@Builder
public class ResultDto {
    public ResultDto(String result, ArrayList<String> errors, Object content) {
        this.result = result;
        this.errors = errors;
        this.content = content;
    }

    private String result;
    private ArrayList<String> errors;
    private Object content;
}
