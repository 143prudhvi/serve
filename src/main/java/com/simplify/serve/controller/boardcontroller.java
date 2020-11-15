package com.simplify.serve.controller;

import java.util.List;

import com.simplify.serve.entity.Board;
import com.simplify.serve.service.boardservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class boardcontroller {
    @Autowired
    private boardservice service;

    @PostMapping("/addboard")
    public Board addBoard(@RequestBody Board board){
        return service.saveBoard(board);
    }

    @PostMapping("/addboards")
    public List<Board> addBoards(@RequestBody List<Board> boards){
        return service.saveBoards(boards);
    }

    @GetMapping("/boards")
    public List<Board> findAllBoards(){
        return service.getBoards();
    }

    @GetMapping("/board/{id}")
    public Board findBoardById(@PathVariable int id){
        return service.getBoardById(id);
    }

    @PutMapping("/updateboard")
    public Board updateBoard(@RequestBody Board board){
        return service.updateBoard(board);
    }

    @DeleteMapping("/deleteboard/{id}")
    public String deleteBoard(@PathVariable int id){
        return service.deleteBoard(id);
    }
}
