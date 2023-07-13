package com.example.hanghaemarket.service;

import com.example.hanghaemarket.dto.RequestDto;
import com.example.hanghaemarket.dto.ResponseDto;
import com.example.hanghaemarket.entity.Board;
import com.example.hanghaemarket.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor

public class BoardService {
    private final BoardRepository boardRepository;

    //<게시글 작성하기>

    public ResponseDto createBoard(RequestDto requestDto){
        Board board = new Board(requestDto);
        Board savedboard = boardRepository.save(board);
        return new ResponseDto(savedboard);
    }

    //<전체조회하기>
    public List<ResponseDto> findAll(){
        return boardRepository.findAll().stream().map(ResponseDto::new).toList();
    }

    //<상세조회하기>
    public ResponseDto getBoardById(Long id) {
        Board board = findBord(id);
        return new ResponseDto(board);
    }

    //<게시글 수정하기>
    public ResponseDto updateBoard(Long id, RequestDto requestDto) {
        Board board = findBord(id);
        board.update(requestDto);
        Board updatedBoard = boardRepository.save(board);
        return new ResponseDto(updatedBoard);
    }

    //<게시글 삭제하기>

    public String deleteBoard(Long id){
        Board board = findBord(id);
        boardRepository.delete(board);
        return "삭제완료";
    }


    private Board findBord(Long id){
        return boardRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글이 존재하지 않습니다"));
    }


}


