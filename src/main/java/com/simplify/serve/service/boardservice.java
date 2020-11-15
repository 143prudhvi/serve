package com.simplify.serve.service;

import java.util.List;

import com.simplify.serve.entity.Board;
import com.simplify.serve.repository.boardrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class boardservice {
    
    @Autowired
    private boardrepo repo;

    public Board saveBoard(Board board){
        return repo.save(board);
    }
    public List<Board> saveBoards(List<Board> board){
        return repo.saveAll(board);
    }
    public List<Board> getBoards(){
        return repo.findAll();
    }
    public Board getBoardById(int id){
        return repo.findById(id).orElse(null);
    }
    public String deleteBoard(int id){
        repo.deleteById(id);
        return "board removed !! " +id;
    }
    public Board updateBoard(Board board){
        Board existingBoard=repo.findById(board.getId()).orElse(null);
        existingBoard.setBoard(board.getBoard());
        existingBoard.setId(board.getId());
        return repo.save(existingBoard);
    }
}
