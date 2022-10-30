package com.example.fow.controller;

import com.example.fow.entity.Board;
import com.example.fow.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public Page<Board> boardList(Pageable pageable){
        System.out.println("/board/list");
        Page<Board> page = null;
        page = boardService.boardList(pageable);
        return page;
    }

    @PostMapping("/writeAction")
    public boolean boardWrite(Board board)
    {
        boardService.boardWrite(board);

        return true;
    }

    @PostMapping("/view/{no}")
    public Board boardView(@PathVariable("no") Integer no)
    {
        Board board = boardService.boardView(no);
        return board;
    }

    @PostMapping("/delete/{no}")
    public void boardDelete(@PathVariable("no") Integer no)
    {
        boardService.boardDelete(no);
    }


}
