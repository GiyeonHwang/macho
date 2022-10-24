package com.example.fow.service;

import com.example.fow.entity.TopChamp;
import com.example.fow.repository.TopChampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ChampService {

    @Autowired
    private TopChampRepository topChampRepository;

    public Page<TopChamp> TopChampChampList(Pageable pageable)
    {
        return topChampRepository.findAll(pageable);
    }
}
