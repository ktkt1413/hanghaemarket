package com.example.hanghaemarket.service;

import com.example.hanghaemarket.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
}
