package com.itwang.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultVo <T>{
    private boolean hasSuccess;

    private String message;

    private T data;
}
