package com.duowenjia.springboottest2.controller;

import com.duowenjia.springboottest2.entity.E_Boke;
import com.duowenjia.springboottest2.respository.BokeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/Boke")
public class BokeHandler {
    @Autowired
    private BokeRespository bokeRespository;
    @GetMapping("/findByPage/{page}/{size}")
    public Page<E_Boke> findAll(@PathVariable("page")Integer page, @PathVariable("size")Integer size){
        Pageable pageable= PageRequest.of(page-1,size);
        return bokeRespository.findAll(pageable);
    }
}

