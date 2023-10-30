package com.example.fow.service;

import com.example.fow.entity.champEntity.*;
import com.example.fow.repository.champRepository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ChampService {

    @Autowired
    private TopChampRepository topChampRepository;

    @Autowired
    private JungleChampRepository jungleChampRepository;
    @Autowired
    private MidChampRepository midChampRepository;

    @Autowired
    private BottomChampRepository bottomChampRepository;

    @Autowired
    private SupportChampRepository supportChampRepository;

    public Page<TopChamp> TopChampList(Pageable pageable)
    {
        return topChampRepository.findAll(pageable);
    }

    public Page<JungleChamp> JungleChampList(Pageable pageable)
    {
        return jungleChampRepository.findAll(pageable);
    }

    public Page<MidChamp> MidChampList(Pageable pageable)
    {
        return midChampRepository.findAll(pageable);
    }

    public Page<BottomChamp> BottomChampList(Pageable pageable)
    {
        return bottomChampRepository.findAll(pageable);
    }

    public Page<SupportChamp> SupportChampList(Pageable pageable)
    {
        return supportChampRepository.findAll(pageable);
    }

}
