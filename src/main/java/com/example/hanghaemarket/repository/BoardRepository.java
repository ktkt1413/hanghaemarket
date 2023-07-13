package com.example.hanghaemarket.repository;

import com.example.hanghaemarket.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByCreatedAtDesc();
        }