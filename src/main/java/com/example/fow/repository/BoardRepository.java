package com.example.fow.repository;

import com.example.fow.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<Board,Integer> {
    @Query("select b from Board b where b.no=:no")
    Board searchById(@Param("no")String no);
}
