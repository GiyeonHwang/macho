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
//                           ,@RequestParam("nickname") String nickname)
    {
        Board board = boardService.boardView(no);
//        if(nickname.equals(board.getNickname()))
//        {
//            board.setCounts(board.getCounts()+1);
//            boardService.boardWrite(board);
//        }
        return board;
    }

    @PostMapping("/delete/{no}")
    public void boardDelete(@PathVariable("no") Integer no)
    {
        boardService.boardDelete(no);
    }

    @PostMapping("/modifyAction/{no}")
    public void boardModify(@PathVariable("no")Integer no,
                               @RequestParam("type")String type,
                               @RequestParam("title")String title,
                               @RequestParam("contents")String contents){

        Board board = boardService.boardView(no);
        board.setType(type);
        board.setContents(contents);
        board.setTitle(title);
        boardService.boardWrite(board);
    }
}
