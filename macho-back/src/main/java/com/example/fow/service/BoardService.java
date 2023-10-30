package com.example.fow.service;

import com.example.fow.entity.Board;
import com.example.fow.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public Page<Board> boardList(Pageable pageable) {
        return boardRepository.findAll(pageable);
    }

    public void boardWrite(Board board)
    {
        boardRepository.save(board);
    }

    public Board boardView(Integer no)
    {
        Board board = boardRepository.findById(no).get();
        return board;
    }
    public void boardDelete(Integer no)
    {
        boardRepository.deleteById(no);
    }
}
