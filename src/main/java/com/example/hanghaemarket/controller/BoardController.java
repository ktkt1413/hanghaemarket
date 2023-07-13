package com.example.hanghaemarket.controller;

import com.example.hanghaemarket.service.BoardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class BoardController {
    private final BoardService boardService;

}
