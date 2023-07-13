package com.example.hanghaemarket.controller;

import com.example.hanghaemarket.dto.RequestDto;
import com.example.hanghaemarket.dto.ResponseDto;
import com.example.hanghaemarket.entity.Board;
import com.example.hanghaemarket.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class BoardController {

    private final BoardService boardService;

    //<게시글 작성>
    @PostMapping("/post")
    public ResponseDto createBoard(@RequestBody RequestDto requestDto){
        return boardService.createBoard(requestDto);
    }

    //<게시글 전체조회>

    @GetMapping("/post")
    public List<ResponseDto> getBoards(){
        return boardService.findAll();
    }

    //<게시글 상세조회>

    @GetMapping("/post/{id}")
    public ResponseDto getBoard(@PathVariable("id") Long id){
        return boardService.getBoardById(id);
    }

    //<게시글 수정>

    @PutMapping("/post/{id}")
    public ResponseDto updateBoard(@PathVariable("id") Long id, @RequestBody RequestDto requestDto){
        return BoardService.updateBoard(id, requestDto);
    }

    //<게시글 삭제>
    @DeleteMapping("/post/{id}")
    public String deleteBoard(@PathVariable("id") Long id, @RequestBody RequestDto requestDto){
        return BoardService.deleteBoard(id, requestDto);
    }

}
