package com.example.hanghaemarket.dto;

import com.example.hanghaemarket.entity.Board;
import lombok.Getter;

@Getter
public class ResponseDto {

    private Long id;
    private String title;
    private String content;
    private Integer price;
    private String name;

    public ResponseDto(Board board){
        this.id = board.getId();
    }

}
